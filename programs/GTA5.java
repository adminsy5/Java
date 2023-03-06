class Games
{
    void run()
    {
        System.out.println("Running");
    }
}
class GTA5 extends Games
{
    void run()
    {
        System.out.println("Amd Ryzen 5600G is Strongly Recommended for gta5 !");
    }
    public static void main(String args[])
    {
        Games g = new GTA5();
        g.run();
    }
}
