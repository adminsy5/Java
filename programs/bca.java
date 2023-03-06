class bca
{
    int id;
    String name;
    bca(int i,String n)
    {
        id=i;
        name=n;
    }
    bca()
    {

    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        bca b1=new bca(101,"ajith");
        bca b2=new bca();
        b2.id=b1.id;
        b2.name=b1.name;
        b1.display();
        b2.display();
    }
}