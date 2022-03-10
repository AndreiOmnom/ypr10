package com.company;

public class Main {

    public static void main(String[] args) {
        //10*.Вывести среднее значение всех цифр в числе.
        int numb = 54734;
        int c = 0;
        //Вывод:
        //4.6
        while ( numb > 0) {
            int cifralast = numb % 10;
            c = cifralast + c ;
            numb = numb / 10;
        }
        double mean;
        mean = (c  * 1.0) / 5;
        System.out.println(mean);
    }
}
