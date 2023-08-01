// Java ForEach Loop Program 
public class ForEach{
    public static void main(String args[]){
        System.out.println("First Example");
        int[] numbers = {101,102,103,104};
        for(int i : numbers){
            System.out.println(i);
        }

        System.out.println("\nSecond Example");
        String[] colours = {"Red","Pink","Blue","Orange","White","BLack","Gray"};
        for(String str : colours){
            System.out.println(str);
        }
    }
}