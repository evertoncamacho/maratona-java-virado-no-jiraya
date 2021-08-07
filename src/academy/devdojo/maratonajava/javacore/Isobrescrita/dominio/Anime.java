package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override //Para garantir que está realizando a sobrescrita
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
