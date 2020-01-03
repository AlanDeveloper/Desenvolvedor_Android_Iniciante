package com.example.festafimdeano.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.festafimdeano.R;
import com.example.festafimdeano.constant.FestaFimDeAno;
import com.example.festafimdeano.data.SecurityPreferences;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreferences mSecurityPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mSecurityPreferences = new SecurityPreferences(this);

        this.mViewHolder.check = findViewById(R.id.check);
        
        this.loadDataFromActivity();
    }

    private void loadDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String presence = extras.getString(FestaFimDeAno.PRESENCE_KEY);
            if(presence != null && presence.equals(FestaFimDeAno.CONFIRMATION_YES)) {
                this.mViewHolder.check.setChecked(true);
            } else {
                this.mViewHolder.check.setChecked(false);
            }
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.check) {

            if(this.mViewHolder.check.isChecked()) {
                this.mSecurityPreferences.storeString(FestaFimDeAno.PRESENCE_KEY, FestaFimDeAno.CONFIRMATION_YES);
            } else {
                this.mSecurityPreferences.storeString(FestaFimDeAno.PRESENCE_KEY, FestaFimDeAno.CONFIRMATION_NO);
            }
        }
    }

    private static class ViewHolder {
        CheckBox check;
    }
}
