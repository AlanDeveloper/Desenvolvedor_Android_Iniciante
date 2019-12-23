public class Strings {
    public static void main(String[] args) {
        String nome = "Java";
        System.out.println("Primeiro caracter: " + nome.charAt(0));

        String sobrenome = "Rules";
        System.out.println(nome + " " + sobrenome);

        Integer idade = 10;
        System.out.println("Idade: " + idade + " anos");

        Double d = 1043860.9;
        String strDouble = String.valueOf(d);
        
        Integer c = Integer.valueOf("10");
        System.out.println("Convertendo: " + c);
    }
}
