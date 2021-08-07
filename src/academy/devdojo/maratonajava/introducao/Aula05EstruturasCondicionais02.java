package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {

        //Variáveis dentro de métodos possuem um escopo local. Elas precisam ser inicializadas antes de serem executadas.

        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto

        int idade = 20;
        String categoria;

        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
