// Java Binary Search Program 
import java.util.Scanner;
public class JavaBinarySearchProgram{
    public static void main(String args[]){
        int[] array1 = new int[]{2,4,5,1,5,6,8,9,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nuber to find from the array  : ");
        int number = sc.nextInt();
        for(int i=0; i<array1.length; i++){
            if(array1[i] == number){
                System.out.println("Number is present at index : " +i);
            }
            else{
                 System.out.println("Number is not present");
                 break;
            }
        }
    }
}