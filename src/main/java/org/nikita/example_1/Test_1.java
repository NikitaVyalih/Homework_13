package org.nikita.example_1;

public class Test_1 {

    public static void main(String[] args) {

        //Рассмотрим еще один вид loop - while / do while
        //Вопрос: зачем нам больше двух видов loop?
        // for loop используем тогда, когда нам заранее известно сколько раз нам нужно пройти по циклу
        // while loop используем тогда, когда заранее нам НЕ известно сколько раз нужно пройти по циклу

        // Вывести в консоль числа от 0 до 10

        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }
        System.out.println("--------");

        // попробуем тоже самое сделать с циклом while
        int i = 0;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println(i);


    }

}
