public class Exercicio5 {
    public Float funcao(float x, float y, float z) {
        return ((x + y) * x) / z;
    } 

    public static void main(String[] args) {
        Exercicio5 ex5 = new Exercicio5();
        System.out.print("Resultado: " + ex5.funcao(5f, 10f, 2f));
    }
}