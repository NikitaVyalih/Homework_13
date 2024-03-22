package org.nikita.hw;

import java.util.Scanner;

public class Test_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int x = 1;
        do {
            System.out.println(n + " * " + x + " = " + (n*x));
            x++;
        }
        while (x < 10);
        scanner.close();
    }
}
