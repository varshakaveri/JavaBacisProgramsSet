// Java Logical Operations 
public class LogicalOperations{
	public static void main(String args[]){
		int number1 = 10, number2 = 13;
		System.out.println(+number1==number2 && number1<number2);
		System.out.println(number1<=number2 || number1>= number2);
		System.out.println(number1++ > number2-- || number2 < number1);
		System.out.println(number2 > number1 && number2-- > number1);
	}
}
