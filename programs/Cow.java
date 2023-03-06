class animal
{
    void eat()
    {
        System.out.println("eating various things :- ");
    }
}
class Dog extends animal
{
    void eat()
    {
        System.out.println("dog eats meat");
    }
}
class Cat extends animal
{
    void eat()
    {
        System.out.println("cat eats fish");
    }
}
class Cow extends animal
{
    void eat()
    {
        System.out.println("cow eats grass");
    }

    public static void main(String args[])
    {
        animal a1,a2,a3,a4;
        a1=new animal();
        a2=new Dog();
        a3=new Cat();
        a4=new Cow();
        a1.eat();
        a2.eat();
        a3.eat();
        a4.eat();
    }

}