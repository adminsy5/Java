public class BitwiseOperator
{
    public static void main(String args[])
    {
        int a=2;
        int b=3;

        System.out.println("a & b = "+(a&b));
        System.out.println("a | b = "+(a|b));
        System.out.println("a ^ b = "+(a^b));
        System.out.println(" ~a = "+(~a));
        a&=b;
        System.out.println("a = "+a);
    }
}