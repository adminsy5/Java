class math
{
    int a;
    double b;
    static double c = 5.5;
    math(int x,double y)
    {
        a=x;
        b=y;
    }
    void sum()
    {
        System.out.println("a x b x c = "+(a*b*c));
    }
    public static void main(String args[])
    {
        math m1=new math(5,2.5);
        m1.sum();
    }
}