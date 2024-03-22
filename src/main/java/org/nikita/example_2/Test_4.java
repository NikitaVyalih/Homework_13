package org.nikita.example_2;

public class Test_4 {

    public static void main(String[] args) {

//        while (5 == 10) {
//            System.out.println("I DO"); unreachable statement
//        }

        do {
            System.out.println("I DO");
        }
        while (5 == 10);
    }

}
