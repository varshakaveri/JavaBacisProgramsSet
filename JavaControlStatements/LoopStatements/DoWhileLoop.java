// Java Do While Loop Program 
public class DoWhileLoop{
    public static void main(String args[]){
        int number = 20;
        int i = 1;
        do{
            if(i % 3 == 0)
                System.out.println(i);
            i++;
        }
        while(i<=number);
    }
}