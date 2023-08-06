//Java Clone Program
public class JavaCloneProgram implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    String str = "New Object Created with Clone method";

    public static void main(String args[]){
        JavaCloneProgram object1 = new JavaCloneProgram();

        try{
            JavaCloneProgram object2 = (JavaCloneProgram)object1.clone();
            System.out.println(object2.str); 
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}