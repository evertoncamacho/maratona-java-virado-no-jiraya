package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // Em interfaces, todos os métodos são public e abstract por default. Interface é um contrato, e as classes que a implementam devem seguir tal contrato.

    public static final int MAX_DATA_SIZE = 10; // Em interfaces, todos os atributos são constantes por default.

    public abstract void load();

    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
