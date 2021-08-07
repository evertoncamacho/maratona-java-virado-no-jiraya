package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {

    public static void main(String[] args) {
        String nome = "Everton"; //String constant pool
        String nome2 = "Everton";

        nome = nome.concat(" Camacho");

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Everton"); // 1: variável de referência, 2: um objeto do tipo String, 3: uma string no pool de string
        System.out.println(nome2 == nome3.intern());
    }
}
