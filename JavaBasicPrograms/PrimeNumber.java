// Java Prime number program

import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print prime numbers : ");
        int numbers = sc.nextInt();

        for(int i = 2; i <= numbers ; i++){
           int flag =0;
            for(int j = 2 ; j < i ; j++){
                if(i%j==0){
                    flag++;
                    break;
                } 
            }
            if(flag == 0){
                    System.out.println(i+ " is a prime number");
            }
        }
    }
}