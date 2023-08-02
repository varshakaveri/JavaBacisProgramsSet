// Java Break Statement

import java.util.Scanner;
public class BreakStatements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        while(age >= 18){
            System.out.println("You are eligible to get driving license.");
            age++;
            break;
        }
    }
}