// Java If-Else-if statement

public class IfElseIfStatements{
    public static void main(String args[]){
        int number1 = 18;
        int number2 = 25;
        int number3 = 21;
        if(number1 > number2 && number1 > number3){
            System.out.println("The maximum number is : " +number1);
        }
        else if(number2 > number3)
        {
            System.out.println("The maximum number is : " +number2);
        }
        else{
            System.out.println("The maximum number is : " +number3);
        }
    }
}