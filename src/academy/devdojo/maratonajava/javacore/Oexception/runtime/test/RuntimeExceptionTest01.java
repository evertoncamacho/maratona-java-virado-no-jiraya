package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {

    public static void main(String[] args) {
        /* Checked: são verificadas em tempo de compilação, por exemplo SQLException. Logo, caso não haja tratamento de tal exceção, não será possível compilar.
         Unchecked: são verificadas em tempo de execução, por exemplo NullPointerException. Devem ser evitados pelo programador */

        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }

}
