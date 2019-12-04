package ru.levelup.Natalia.Polygalova.qa.homework_1.task_1;

public class Factorial {
    public double factor (int num1){
    double result = 1;
    for (int i = num1; i > 1; i--) {
        result *= i;
    }
        return result;
   }
}
