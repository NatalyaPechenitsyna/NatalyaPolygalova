package ru.levelup.Natalia.Polygalova.qa.homework_1.task_1;

public class Exponent {
    public double expon(int num1, double num2) {
        double result = 1;
        for (int i = 0; i < num1; i++) {
            result *= num2;
        }
        return result;
    }
}
