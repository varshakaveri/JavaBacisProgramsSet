// Java Least common multiple

import java.util.Scanner;
public class JavaLCMProgram{

    static int findGCD(int firstNumber, int secondNumber){
        if(firstNumber == 0){
            return secondNumber;
        }
        return findGCD(secondNumber%firstNumber, firstNumber);
    }

    static int findLCM(int firstNumber, int secondNumber){
        return (firstNumber/findGCD(firstNumber, secondNumber))*secondNumber;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number : ");
        int secondNumber = sc.nextInt();
        System.out.println("The LCM of " +firstNumber+ " and " +secondNumber+ "is : " +findLCM(firstNumber, secondNumber)); 
    }
}