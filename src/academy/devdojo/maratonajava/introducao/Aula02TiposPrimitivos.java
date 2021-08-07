package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        /*
            byte: 1 byte
            short: 2 bytes
            int: 4 bytes
            long: 8 bytes

            float: 4 bytes
            double: 8 bytes

            boolean: 1 bit
            char: 2 bytes
        */

        byte idadeByte = 127;
        short idadeShort = 32000;
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.89;

        float salarioFloat = (float) 2500.0D;
        double salarioDouble = 2500.0;

        boolean verdadeiro = true;
        boolean falso = false;

        char caractere = '\u0042';
        String nome = "Goku";

        System.out.println("A idade é " + idade);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é " + nome);

    }
}
