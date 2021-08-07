package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nome = "Eveton Camacho", endereco = "Rua tal", dataRecebimentoSalario = "21/05/2021";
        double salario = 7500;

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ",\n" + "confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario + "." );

    }

}
