// Java program to print palindrome number

import java.util.Scanner;
public class PalindromeProgram2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int temp=number, sum=0;
        while(number > 0){
            int rem = number % 10;
            sum = (sum*10)+rem;
            number = number/10; 
        }
        if(temp==sum){
            System.out.println("Entered number is Palindrome.");
        }
        else{
            System.out.println("Entered number is not palindrome.");
        }
    }
}