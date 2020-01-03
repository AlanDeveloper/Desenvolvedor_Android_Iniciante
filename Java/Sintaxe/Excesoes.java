public class Excesoes {
    public static void main(String[] args) {

        try {
            String str = "Curso de Java";
            str.charAt(200);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Erro conhecido!");
        } catch(Exception e) {
            System.out.println("Erro desconhecido!");
        } finally {
            System.out.println("Executei");
        }
        System.out.println("Teste!");
    }
}