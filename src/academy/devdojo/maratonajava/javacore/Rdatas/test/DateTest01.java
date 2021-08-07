package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {

    public static void main(String[] args) {
        Date date = new Date(1625338718485L); // Trabalha com um long que representa os  milissegundos desde 01/01/1970
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
