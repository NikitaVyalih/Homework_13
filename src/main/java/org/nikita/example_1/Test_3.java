package org.nikita.example_1;

public class Test_3 {

    public static void main(String[] args) {

        boolean b = true;
        int a = 1;


        while (b) {
            System.out.println(a);
            if (a % 7 == 0 && a % 3 == 0){
                //break;
                b = false;
            }
            a++;
        }

    }

}
