// Java Continue Statements Program

import java.util.Scanner;
public class ContinueStatements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = sc.nextInt();
        while(number <= 15){
            if(number == 10)
            {
                number++;
                continue;
            }
            System.out.println(number);
            number++;
        }
    }
}