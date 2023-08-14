// Java program to count number of character in a given string
import java.util.Scanner;
public class JavaCountCharacterProgram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count number of characters from is : ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i < str.length() ; i++){
             if(str.charAt(i) != ' ')    
                count++;    
        }
        System.out.println("Total number of characters in a given string are : " +count);
    }
}