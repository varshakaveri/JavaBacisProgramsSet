// Java program to compare the two objects

public class JavaObjectProgram{
    public static void main(String args[]){
        String test1 = new String("Testing");
        Double test2 = new Double(25.50);
        Long test3 = new Long(12);
        System.out.println("Comparing string object with long object is " + test1.equals(25.50));
        System.out.println("Comparing string object with long object is " + test2.equals(25.50));
        System.out.println("Comparing string object with long object is " + test3.equals(25.50));
        System.out.println("Comparing string object with long object is " + test1.equals(test2));
        System.out.println("Comparing string object with long object is " + test2.equals(test3));
        System.out.println("Comparing string object with long object is " + test3.equals(12L));
    }
}