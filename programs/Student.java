class Student
{
    int id;
    String name;
    Student(int i,String n)
    {
        id=i;
        name=n;
    }
    Student(Student s)
    {
        id=s.id;
        name=s.name;
    } 
    void display()
    {
        System.out.println("\n"+id+" "+name+"\n");
    }
    public static void  main(String args[])
    {
        Student s1 = new Student(101,"ajith");
        s1.display();
        System.out.println("\nAfter Invoking Copy Comstructor !\n");
        Student s2 = new Student(s1);
        s2.display();
    }
}