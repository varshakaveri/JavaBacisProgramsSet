// Java Binary Search Program 
import java.util.Scanner;
public class JavaBinarySearchProgram{

    public static int binarySearch(int array1[],int first, int last, int number){
        if(last >= first){
            int middle = (first + last)/2;
            if(array1[middle] == number){
                return middle;
            }
            if(array1[middle] > number){
                return binarySearch(array1, first, middle-1, number);
            }
            else{
                return binarySearch(array1, middle+1, last, number);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] array1 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nuber to find from the array  : ");
        int number = sc.nextInt();
        int last = array1.length - 1;
        int result = binarySearch(array1,0,last,number);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is found at index : "+result);
        }
    }
}