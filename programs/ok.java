class ok
{
    int a;
    double b;
    ok(int x,double y)
    {
        a=x;
        b=y;
    }
    ok(ok o)
    {
        a=o.a;
        b=o.b;
    }
    void sum()
    {
        System.out.println("\n"+"a x b = "+(a*b)+"\n");
    }
    public static void main(String args[])
    {
        ok o1=new ok(5,3.14);
        o1.sum();
        System.out.println("\nafter invoking copy constructor\n");
        ok o2=new ok(o1);
        o2.sum();
    }
}