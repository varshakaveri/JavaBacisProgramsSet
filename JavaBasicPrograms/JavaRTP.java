// Java Program to Create Right Triangle
import java.util.Scanner;
public class JavaPattern1Program{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print triangle : ");
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}