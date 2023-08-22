// Java Largest program 
public class JavaLargestProgram{
    public static void main(String args[]){
        int[] arr = new int[]{25,45,3,27,13,15};
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element in a given array is : "+max);
    }
}