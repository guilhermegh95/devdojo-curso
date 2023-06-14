package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long and boolean
        int idade = (int )10000000000L; //Errado
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShot = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; //Aspas simples
        String nome = "Goku"; //Aspas duplas


        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char: " + caractere);
        System.out.println(idade);
        System.out.println("Oi, meu nome é " + nome);
    }
}
