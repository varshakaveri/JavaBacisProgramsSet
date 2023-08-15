// Java array program to copy one array into the another array

public class JavaArrayProgram1{
    public static void main(String args[]){
        int[] array1 = new int[]{2,3,5,7,8,11,13};
        int array2[] = new int[array1.length];

        //First Array
        System.out.println("Display First Array Elements : ");
        for(int i =0 ; i < array1.length; i++ ){
            System.out.println(array1[i]);
        }

        for(int i=0 ; i < array1.length; i++){
            array2[i] = array1[i];
        }

        //Second Array
        System.out.println("\nDisplay Second Array Elements : ");
        for(int i =0 ; i< array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}