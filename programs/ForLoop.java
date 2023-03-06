public class ForLoop
{
    public static void main(String args[])
    {
        int[] numbers={10,20,30,40,50};
        for(int x : numbers)
        {
            System.out.println(x);
            System.out.println(",");
        }
        System.out.println("\n");
        String[] names={"james","larry","tom","lacy"};
        for(String name : names)
        {
            System.out.println(name);
            System.out.println(",");
        }
    }

}