package com.itProger;

import java.io.IOException;
import java.util.Scanner;

/**
 * Класс Калькулятор
 * Выполняет простейшие операция +,-,*,/ для дробных чисел
 * @author  Андреев Иван
 */
public class Calculator {

    public static void main(String[] args) {
        boolean replay;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        double x = scanner.nextDouble();// Запись первого числа в переменную
        System.out.print("Введите второе число:");
        double y = scanner.nextDouble();//Запись второго числа в переменную
        System.out.println("Доступные операции: ");
        System.out.print("+\n-\n*\n/\n");

        System.out.print("Выберите операцию: ");
        // Запуск цикла с выбором операции для вычисления
        do {

            replay = true;
            char z = scanner.next().charAt(0);//Запись операции вычисления в переменную

            switch (z) {
                    //При выборе пользователем операции сложения выполняется код после двоеточия
                case '+':
                    System.out.printf(x + " + " + y + " = %.4f", (x + y));//Сложение чисел с округлением до 4 знаков после запятой
                    break;
                    //При выборе пользователем операции вычитания выполняется код после двоеточия
                case '-':
                    System.out.printf(x + " - " + y + " = %.4f", (x - y));//Вычитание чисел с округлением до 4 знаков после запятой
                    break;
                    //При выборе пользователем операции умножения выполняется код после двоеточия
                case '*':
                    System.out.printf(x + " * " + y + " = %.4f", (x * y));//Умножение чисел с округлением до 4 знаков после запятой
                    break;
                    //При выборе пользователем операции деления выполняется код после двоеточия
                case '/':
                    if (y == 0) {
                        System.out.println("На 0 делить нельзя!!!");
                        break;
                    } else {
                        System.out.printf(x + " / " + y + " = %.4f", (x / y));
                        break;
                    }
                    //При неверном вводе орперации выполняется код после двоеточия
                default:
                    replay = false;
                    System.out.println("Такой операции нет.Повторите ввод:");
            }

        } while (replay == false);//Проверка условия в цикле

    }
}


