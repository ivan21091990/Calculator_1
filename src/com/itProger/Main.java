package com.itProger;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        double x = scanner.nextDouble();
        System.out.print("Введите второе число:");
        double y = scanner.nextDouble();
        System.out.println("Доступные операции: ");
        System.out.print("+\n-\n*\n/\n");

        System.out.print("Выберите операцию: ");
        char z = scanner.next().charAt(0);

        switch (z) {
            case '+':
                System.out.printf(x + " + " + y + " = %.4f", (x + y));
                break;
            case '-':
                System.out.printf(x + " - " + y + " = %.4f", (x - y));
                break;
            case '*':
                System.out.printf(x + " * " + y + " = %.4f", (x * y));
                break;
            case '/':
                if (y == 0) {
                    System.out.println("На 0 делить нельзя");
                } else {
                System.out.printf(x + " / " + y + " = %.4f", (x / y));
                break;
                }
             default:
                 System.out.println("Неверная операция");
             }

        }

    }


