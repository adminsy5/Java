class Bikes
{
    void speed()
    {
        System.out.println("Various speed of Bikes: :-)");
    }
}
class Splendor extends Bikes
{
    void speed()
    {
        System.out.println("Splendor Runs at 45km/hr !");
    }
}
class Shine extends Bikes
{
    void speed()
    {
        System.out.println("Shine Runs at 55km/hr !");
    }
}
class CT100 extends Bikes
{
    void speed()
    {
        System.out.println("CT100 Runs at 60km/hr !");
    }
    public static void main(String args[])
    {
        Bikes b1,b2,b3,b4;
        b1 = new Bikes();
        b2 = new Splendor();
        b3 = new Shine();
        b4 = new CT100();
        b1.speed();
        b2.speed();
        b3.speed();
        b4.speed();
    }
}
