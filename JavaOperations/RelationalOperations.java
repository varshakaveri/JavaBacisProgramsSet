// Java Relational Operations
/* 
comparison	: < > <= >= instanceof
equality :	== !=
*/

public class RelationalOperations{
    public static void main(String args[]){
        int number1 = 18 ;
        int number2 = 15 ;
        if(number1>number2){
            System.out.println("Candidate is eligible to cast a vote,");
        }
        else{
            System.out.println("Not eligible to case a vote");
        }

        System.out.println(number1 < number2);
        System.out.println(number1 > number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 == number2);
        System.out.println(number1 != number2);
    }
}