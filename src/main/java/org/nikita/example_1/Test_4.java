package org.nikita.example_1;

public class Test_4 {

    public static void main(String[] args) {

        int a = 5;

        while (++a > 10) {
            a++;
        }
        System.out.println(a);
        //Ответ - 6
        System.out.println("------------");
        int b = 5;
        while (++b < 10) {
            b++;
        }
        System.out.println(b);
        // Ответ 10
        System.out.println("-------------");

        int c = 5;
        while (c == 10) {
            System.out.println("Hi");
        }
        //Ответ ---
        System.out.println("-----------");


        int d = 0;
        while (d == 1);
        System.out.println("Hey");
        // ответ - Hey
        System.out.println("--------");

//        while (true);
//        System.out.println("by"); не выполнится так как бесконечный цикл while
//
//        System.out.println("ss");
    }

}
