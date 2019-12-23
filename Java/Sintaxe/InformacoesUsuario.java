import java.util.Scanner;

public class InformacoesUsuario {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(final String[] args) {

        Integer valor;
        System.out.print("Informe um número: ");

        valor = SCANNER.nextInt();
        System.out.println(valor + 10);
    }

}
