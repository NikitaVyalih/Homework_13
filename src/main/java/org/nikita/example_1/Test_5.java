package org.nikita.example_1;

public class Test_5 {

    public static void main(String[] args) {

        int i = Integer.MIN_VALUE;

        while (true) {
            i++;
            if (i == Integer.MAX_VALUE){
                break;
            }
        }
        System.out.println(i);


    }
}
