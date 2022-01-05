package com.company;
import java.util.Scanner;

public class MenuDrivenCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int i = getNumber();
        label:
        while(true) {
                System.out.print("Enter a mathematical operator (+, -, *, /, %) : ");
                String operator = scanner.next();
            switch (operator) {
                case "+": {
                    int j = getAnotherNumber();
                    Addition(i, j);
                    break label;
                }
                case "-": {
                    int j = getAnotherNumber();
                    Subtraction(i, j);
                    break label;
                }
                case "*": {
                    int j = getAnotherNumber();
                    Multiplication(i, j);
                    break label;
                }
                case "/": {
                    int j = getAnotherNumber();
                    Division(i, j);
                    break label;
                }
                case "%": {
                    int j = getAnotherNumber();
                    Modulus(i, j);
                    break label;
                }
            }
        }
    }

    public static int getNumber(){
        System.out.print("Enter a number : ");
        int i;
        while(true) {
            try {
                i = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Enter a number : ");
                scanner.next();
            }
        }
        return i;
    }

    public static int getAnotherNumber(){
        System.out.println("Enter another number : ");
        int j;
        while(true) {
            try {
                j = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Enter another number : ");
                scanner.next();
            }
        }
        return j;
    }

    public static void Addition(int i, int j){
            System.out.print(i + " + " + j + " = " + (i+j));
    }

    public static void Subtraction(int i , int j){
        System.out.print(i + " - " + j + " = " + (i-j));
    }

    public static void Multiplication(int i , int j){
        System.out.print(i + " * " + j + " = " + (i*j));

    }

    public static void Division(int i, int j){
        System.out.print(i + " / " + j + " = " + (i/j));
    }

    public static void Modulus(int i, int j){
        System.out.print(i + " % " + j + " = " + (i%j));
    }

}
