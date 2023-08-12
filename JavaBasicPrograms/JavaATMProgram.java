// Java ATM Program

import java.util.Scanner;

public class JavaATMProgram{
    public static void main(String args[]){
        int balance=0, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n----- Automated Teller Machine ------");
            System.out.println("Choose 1 : For Deposit");
            System.out.println("Choose 2 : For Withdraw");
            System.out.println("Choose 3 : For Check Balance");
            System.out.println("Choose 4 : For Exit");
            System.out.println("\nChoose the operation you want to perform : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : System.out.println("\nEnter money to be deposited : ");
                         deposit = sc.nextInt();
                         balance = balance + deposit;
                         System.out.println("\nYour money has been successfully deposited....");
                         break;

                case 2 : System.out.println("\nEnter money to be withdrawn : "); 
                         withdraw = sc.nextInt();
                         if(balance>=withdraw){
                            balance = balance - withdraw;
                            System.out.println("\nMoney successfully withdrawn....");
                         }        
                         else{
                            System.out.println("\nInsufficient Balance\n");
                         }
                         break;

                case 3 : System.out.println("\nTotal Balance : " +balance);
                         break;

                case 4 : System.exit(0);

            }           
        }
    }
}