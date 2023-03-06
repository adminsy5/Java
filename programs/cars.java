class cars
{
    void type()
    {
        System.out.println("We are going to see types of car: :-)");
    }
}
class sport extends cars
{
    void type()
    {
        System.out.println("McLaren Hello Mr. I am sport car !");
    }
}
class racing extends cars
{
    void type()
    {
        System.out.println("SuperGt Hello Mr. I am racing car !");
    }
}
class offroad extends cars
{
    void type()
    {
        System.out.println("RangeRover Hello Mr. I am offroad car !");
    }
    public static void main(String args[]) 
    {
        cars c1,c2,c3,c4;
        c1 = new cars();
        c2 = new sport();
        c3 = new racing();
        c4 = new offroad();
        c1.type();
        c2.type();
        c3.type();
        c4.type();
    }
}