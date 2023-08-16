// Java program to find frequency of each elemnt in the array
public class JavaArrayProgram2{
    public static void main(String args[]){
        int[] array1 = new int[]{1,2,3,4,3,5,2,6,1,1,3,2,6};  
        int[] fr = new int[array1.length];
        int visited = -1;
        for(int i=0; i<array1.length;i++){
            int count=1;
            for(int j=i+1; j<array1.length; j++){
                if(array1[i]==array1[j]){
                    count++;
                    fr[j]=visited;
                }
            }
            if(fr[i] != visited){
                fr[i] = count;
            }

            System.out.println("Element     |       Frequency");

            for(int i=0; i<fr.length;i++){
                if(fr[i] != visited){
                    System.out.println(""+array1[i]+ " | "+fr[i]);
                }
            }
        }
    }
}
