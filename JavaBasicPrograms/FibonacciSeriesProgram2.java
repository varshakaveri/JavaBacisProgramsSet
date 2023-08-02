// Java FIbonacci Series Program with recursion.

import java.util.Scanner;
public class FibonacciSeriesProgram2{

    static int num1 = 0, num2 = 1, num3;
    public static void fiboRecu(int number){
        for(int i = 2; i < number; i++){
        num3 = num1+num2;
        System.out.println(num3);
        num1 = num2;
        num2 = num3;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print fibonacci series : ");
        int number = sc.nextInt();
        System.out.println("FIbonacci Series are : ");
        System.out.println(num1+ "\n" +num2);
        fiboRecu(number);
    }
}