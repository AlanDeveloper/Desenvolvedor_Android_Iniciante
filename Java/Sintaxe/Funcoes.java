public class Funcoes {

    private void helloWorld() {
        System.out.println("Olá, mundo!");
    }

    private int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        funcoes.helloWorld();

        System.out.println(funcoes.soma(10, 20));
    }
}