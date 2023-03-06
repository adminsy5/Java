class computer
{
    int a,b,c;
    computer(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void display()
    {   
        System.out.println("\n"+" "+(a)+" "+"+"+" "+(b)+" "+"x"+" "+(c)+" "+"="+(a+b*c)+"\n");
    }
    public static void main(String args[])
    {
        computer c1 = new computer(12,23,34);
        c1.display();
    }
}