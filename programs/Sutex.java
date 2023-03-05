class Sutex
{
    void data()
    {
        System.out.println("This is Sutex !");
    }
}
class BCA extends Sutex
{
    void data()
    {
        System.out.println("This is Bca !");
    
    }
}
class Sybca5 extends Sutex
{
    void data()
    {
        System.out.println("This is Sybca5 !");
    }
}
class Student extends Sutex
{
    void data()
    {
        System.out.println("I am Rajat From Sybca5 !");
    }
    public static void main(String args[])
    {   
        Sutex s1,s2,s3,s4;
        s1=new Sutex();
        s2=new BCA();
        s3=new Sybca5();
        s4=new Student();
        s1.data();
        s2.data();
        s3.data();
        s4.data();
    }
}
