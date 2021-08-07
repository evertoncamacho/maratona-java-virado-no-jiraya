package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    //Classes Wrappers servem para encapsular um tipo primitivo e transformar em objeto
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //Autoboxing: um tipo primitivo é transformado automaticamente em um wrapper
        Byte byteW = 12;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        //Unboxing: um wrapper é transformado em um tipo primitivo
        int i = intW;

        Integer intW2 = Integer.parseInt("1");
        Boolean verdadeiro = Boolean.parseBoolean(null);
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
