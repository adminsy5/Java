class Test
{
static void avg() 
{
 try
 {
 int i= 5/0;
 throw new ArithmeticException();
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