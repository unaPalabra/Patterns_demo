package BehavioralPatterns.Comand;

// Реализуем 2 метода, которые будут выводить на экран сумму и разность двух чисел.
public class Calculator {
    public void addition(int a, int b){
        System.out.println(a + b);
    }
    public void substraction(int a, int b){
        System.out.println(a - b);
    }
}
