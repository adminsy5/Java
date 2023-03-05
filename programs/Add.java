class Add
{
    int a;
    Double b;
    Add(int x,Double y)
    {
        a=x;
        b=y;
    }
    void ans()
    {
        System.out.println("The Addition is :- "+(a+b));
        System.out.println("The substraction is :- "+(a-b));
        System.out.println("The multiplication is :- "+(a*b));
        System.out.println("The division is :- "+(a/b));
    }
    public  static  void    main(String args[])
    {
        Add a1 = new Add(5,4.5);
        a1.ans();
    }
}