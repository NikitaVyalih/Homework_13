package org.nikita.zzz_test;

import java.util.Scanner;

public class Test_1 {

    public static void main(String[] args) {

        //Пользователь вводит число N. Программа должна вычислить сумму первых N простых чисел

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        final int N = scanner.nextInt(); //10


        int sum = 0; // 0
        int iterationCount = 0; // 0
        int currentNumber = 0; // 0


        while (iterationCount < N) {
            if (isPrime(currentNumber)) {
                sum += currentNumber;
            }
            iterationCount++;
            currentNumber++;
        }
        System.out.println("Сумма первых простых чисел от 0 до " + N + " = " + sum);
        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
