package org.nikita.hw;

import java.util.Scanner;

//Напишите программу для вывода таблицы умножения от 1 до 10 для заданного числа,
//введенного пользователем используя while и do while
public class Test_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        while (0 <= n) {
            for (int x = 1; x < 10; x++) {
                System.out.println(n + " * " + x + " = " + (x * n));
            }
            break;
        }
        scanner.close();
    }
}
