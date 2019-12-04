package ru.levelup.Natalia.Polygalova.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Program calc = new Program();
        calc.startProgrApp();
    }

    private void startProgrApp() {
        Scanner scn = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Выберете и введите операцию для вычисления: a+b, a-b, a*b, a^b, a!, Fibonacci");
            String calculation = scn.next();

            try {
                if (calculation.equals("a+b")) {
                    System.out.println("Введите первое число");
                    int num1 = scn.nextInt();
                    System.out.println("Введите второе число");
                    int num2 = scn.nextInt();
                    Addition add = new Addition();
                    double result = add.addit(num1, num2);
                    System.out.println("Сумма введенных значений =: " + result);
                } else if (calculation.equals("a-b")) {
                    System.out.println("Введите первое число");
                    int num1 = scn.nextInt();
                    System.out.println("Введите второе число");
                    int num2 = scn.nextInt();
                    Subtraction sub = new Subtraction();
                    double result = sub.subtr(num1, num2);
                    System.out.println("Разница введенных значений =: " + result);
                } else if (calculation.equals("a*b")) {
                    System.out.println("Введите первое число");
                    int num1 = scn.nextInt();
                    System.out.println("Введите второе число");
                    int num2 = scn.nextInt();
                    Multiplication mul = new Multiplication();
                    double result = mul.multip(num1, num2);
                    System.out.println("Результат умножения введенных значений =: " + result);
                } else if (calculation.equals("a^b")) {
                    System.out.println("Введите число");
                    int num1 = scn.nextInt();
                    System.out.println("Введите степень числа");
                    int num2 = scn.nextInt();
                    Exponent exp = new Exponent();
                    double result = exp.expon(num1, num2);
                    System.out.println("Результат возведения в степень =: " + result);
                } else if (calculation.equals("a!")) {
                    System.out.println("Введите число");
                    int num1 = scn.nextInt();
                    Factorial fact = new Factorial();
                    double result = fact.factor(num1);
                    System.out.println("Значение факториала =: " + result);
                } else if (calculation.equals("Fibonacci")) {
                    System.out.println("Введите первое число");
                    int num1 = scn.nextInt();
                    Fibonacci fib = new Fibonacci();
                    double result = fib.fibon(num1);
                    System.out.println("Значение Фибоначчи =: " + result);
                } else
                    System.out.println("Операция не распознана.");
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат введенных чисел");
            } catch
            (NumberFormatException e) {
                System.out.println("Неверный формат введенных чисел");
            }
        }
    }
}





