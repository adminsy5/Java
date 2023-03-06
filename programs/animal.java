//simple inheritance :- 
class Animal
{
    void display()
    {
        System.out.println("\nAnimals are divided in 3 types :- \n");
    }
}
class herbivores extends Animal
{
    void display()
    {
        System.out.println("herbivores eats grassess .\n");
    }
}
class carnivores extends Animal
{
    void display()
    {
        System.out.println("carnivores eats fleshes .\n");
    }
}
class omnivores  extends Animal
{
    void display()
    {
        System.out.println("omnivores eats both grasses and fleshes .\n");
    }
        public static void main(String args[])
    {
        Animal a1,a2,a3,a4;
        a1=new Animal();
        a2=new herbivores();
        a3=new carnivores();
        a4=new omnivores();
        a1.display();
        a2.display();
        a3.display();
        a4.display();
    }
}