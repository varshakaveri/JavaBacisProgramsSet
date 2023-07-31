// Java Switch Statements

import java.util.Scanner;
public class SwitchStatements{
    public static void main(String args[]){
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
             case 1 : System.out.println("Today is Monday. Everybody should be in White formal dress.");
                        break;
             case 2 : System.out.println("Today is Tuesday. Everybody should be in Pink formal dress.");
                        break;
             case 3 : System.out.println("Today is Wednesday. Everybody should be in orange formal dress."); 
                        break;
             case 4 : System.out.println("Today is Thursday. Everybody should be in Green formal dress.");
                        break;
             case 5 : System.out.println("Today is Friday. Everybody should be in Red formal dress.");
                        break;
             case 6 : System.out.println("Today is Saturday. Everybody should be in Blue formal dress.");  
                        break;
             case 7 : System.out.println("Today is Sunday. Everybody should be in casual dress.");  
                        break;

             default : System.out.println("Wear your favourite dress!");
        }
    }
}