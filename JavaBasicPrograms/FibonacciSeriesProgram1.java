// Java Fibonacci Series Program

import java.util.Scanner;
 public class FibonacciSeriesProgram1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print fibonacci series ");
        int number = sc.nextInt();
        int num1 = 0, num2 = 1, num3 ;
        System.out.println("Fibonacci Series are : ");
        System.out.println(num1+ "\n" +num2);
        for(int i=2;i<=number;i++){
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
 }