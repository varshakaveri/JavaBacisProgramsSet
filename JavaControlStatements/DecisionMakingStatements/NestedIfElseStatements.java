// Java Nested If-Else statement

import java.util.Scanner;
public class NestedIfElseStatements{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("Enter the weight : ");
        int weight = sc.nextInt();
        if(age > 18){
            if(weight > 50 )
            {
                System.out.println("Candidate is able to donate blood.");
            }
            else{
                 System.out.println("Canddiate is not physically fit to donate blood.");
            }
        }
        else{ 
            if(age == 18 && weight == 50){
                System.out.println("Candidate is able to donate blood iff he/she is physically fit.");
            }
            else{
                System.out.println("Canddiate is not physically fit to donate blood.");
            }
        }
    }
}