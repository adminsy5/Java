class Sum
{
    int a;
    Double b;
    Sum(int x,Double y)
    {
        a=x;
        b=y;
    }
    void ans()
    {
        System.out.println("the summation of a and b = "+(a+b));
        System.out.println("the substraction  of a and b = "+(a-b));
        System.out.println("the multiplication of a and b = "+(a*b));
        System.out.println("the division of a and b = "+(a/b));
    }
    public static void main(String args[])
    {
        Sum s1 = new Sum(10,9.5);
        s1.ans();
    }
}