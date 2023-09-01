import java.util.Scanner;

public class JavaTypeConversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = 500;
        String strNumber = String.valueOf(number);
        System.out.println(strNumber);
        System.out.println(strNumber.getClass());

        String str1 = "250";
        Long longNumber = Long.parseLong(str1);
        System.out.println(longNumber);
        System.out.println(longNumber.getClass());
        
        int x = 345;
        int y = 2;
        Float fX = new Float(x);
        float res = fX.floatValue()/y;
        System.out.println("res = "+res);
        
    }
}