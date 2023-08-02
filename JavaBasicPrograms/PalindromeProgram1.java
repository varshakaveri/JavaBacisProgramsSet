// Java Palindrome Program for String or number
import java.util.Scanner;
public class PalindromeProgram1{
    public static void main(String args[]){
        String str2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/number : ");
        String str1 = sc.nextLine();
        for(int i = str1.length()-1;i>=0;i-- ){
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("Entered string is palindrome");
        }
        else{
            System.out.println("Entered string is not palindrome");
        }
    }
}