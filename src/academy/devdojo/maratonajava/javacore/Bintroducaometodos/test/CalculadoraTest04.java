package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        //Em Java passa apenas valor e não referência
        calculadora.alteraDoisNumeros(a, b); //Está passando uma cópia dos valores armazenados em num1 e num2, que são tipos primitivos
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);
    }
}
