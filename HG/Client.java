class MyOwnExceptionClass extends Exception {
 private int price;
 public MyOwnExceptionClass(int price)
{
 this.price = price;
 }
 public String toString()
{
 return "Price should not be in negative, you are entered" +price;
 }
}
public class Client {
public static void main(String[] args)throws Exception
{
 int price = -120;

 if(price < 0)
 throw new MyOwnExceptionClass(price);
 else
 System.out.println("Your price is :"+price);
 }
}