public class Exercicio3 {
    private String helloWorld(String str) {
        return "A palavra possui " + str.length() + " caracteres.";
    }

    public static void main(String[] args) {
        Exercicio3 ex3 = new Exercicio3();
        System.out.print(ex3.helloWorld("ola"));
    }
}