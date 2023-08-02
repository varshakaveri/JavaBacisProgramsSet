// Java Factorial Program 
import java.util.Scanner;
public class FactorialProgram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print factorial of given number : ");
        int number = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=number;i++){
            fact = fact * i;
        }    
        System.out.println(fact);
    }
}