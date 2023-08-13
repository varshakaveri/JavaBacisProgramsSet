// Java GCD of two numbers 

import java.util.Scanner;

public class JavaGCDProgram{

    static int findGCD(int firstNumber, int secondNumber){
        int result=0, num1, num2;
        num1 = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        num2 = (secondNumber > firstNumber) ? firstNumber : secondNumber;
        result = num2;
        while(num1 % num2 != 0){
            result = num1 % num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number : ");
        int secondNumber = sc.nextInt();

        System.out.println("GCD of "+firstNumber+ " and "  +secondNumber+" is : "+findGCD(firstNumber, secondNumber));
    }
}