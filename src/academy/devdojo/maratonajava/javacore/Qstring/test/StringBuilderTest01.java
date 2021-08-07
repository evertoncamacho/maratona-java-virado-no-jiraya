package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {

    public static void main(String[] args) {

        String nome = "Everton";
        nome.concat(" Camacho");
        nome.substring(0, 3);
        System.out.println(nome);

        StringBuffer sb = new StringBuffer("Everton"); //Não é imutável
        sb.append(" Camacho").append(" , Teste");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }

}
