class Music
{
    int no;
    String song;
    Music(int n,String s)
    {
        no=n;
        song=s;
    }
    Music(Music m)
    {
        no=m.no;
        song=m.song;
    }
    void display()
    {
        System.out.println("\n"+no+" "+song+"\n");
    }
    public static void main(String args[])
    {
        Music m1=new Music(1,"Hope - XXXTENTACION");
        m1.display();
        System.out.println("\nAfter Copy Constructor !\n");
        Music m2=new Music(m1);
        m2.display();
    }
}