class games
{
    int id;
    String name;
    games(int a,String b)
    {
        id=a;
        name=b;
    }
    void data()
    {
        System.out.println(id+") "+name);
    }
    public static void main(String args[])
    {
        games g1 = new games(1,"call of duty vanguard");
        games g2 = new games(2,"gta 5");
        games g3 = new games(3,"valorant");
        games g4 = new games(4,"free fire");
        games g5 = new games(5,"stray");
        g1.data();
        g2.data();
        g3.data();
        g4.data();
        g5.data();
    }
}