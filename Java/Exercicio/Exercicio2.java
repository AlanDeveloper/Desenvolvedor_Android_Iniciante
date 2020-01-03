public class Exercicio2 {

    private int helloWorld(String str) {
        int tamanho = str.length();
        return tamanho;
    }

    public static void main(String[] args) {
        Exercicio2 exc1 = new Exercicio2();
        System.out.print(exc1.helloWorld("ola"));
    }
}