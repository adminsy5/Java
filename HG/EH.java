class EH
{
static void avg() throws ArithmeticException
{
 try
 {
 int i= 5/0;
// throw new ArithmeticException("demo");
 }
 catch(ArithmeticException e)
 {
 System.out.println("Exception caught");
 } 
}
public static void main(String args[])
{
 avg(); 
}
}