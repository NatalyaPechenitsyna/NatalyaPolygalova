package ru.levelup.Natalia.Polygalova.qa.homework_1.task_1;

public class Fibonacci {
    public double fibon (int num1){
        int previous=-1;
        int result=1;
        for(int i=0;i<=num1;i++)
        {
            int sum = result+previous;
            previous=result;
            result=sum;
        }
        return result;
    }
}
