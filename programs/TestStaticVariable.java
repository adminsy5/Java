class hello
{
    int id;
    String name;
    static String college = "Sutex";
    hello(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+college);
    }
   // public class TestStaticVariable
   // {
        public static void main(String args[])
        {
            hello h1=new hello(101,"ajith");
            hello h2=new hello(102,"bhajan");
            h1.display();
            h2.display();
        }
   // }
}