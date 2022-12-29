//Programme of Hierarchical Inheritance
class StudentName
{
	String Name;
	int Rno;
	StudentName()
	{
		Name="Piyush";
		Rno=574;
	}
	void DisplayStudentDetail()
	{
		System.out.println("\nMy Name is "+Name+" and My roll number is "+Rno+"\n");

	}
}
class Sy4 extends StudentName
{
	double Sgpa=7.9;
	void DisplaySy4()
	{
		System.out.println("Name : "+Name+"\nSgpa : "+Sgpa+"\n");
	}
}
class Sy5 extends StudentName
{
	double Ygpa=8.37;
	void DisplaySy5()
	{
		System.out.println("Name : "+Name+"\nYgpa : "+Ygpa+"\n");
	}
}
class HierarchicalInheritance extends StudentName
{
	public static void main(String args[])
	{
		HierarchicalInheritance obj1=new HierarchicalInheritance();
		Sy4 obj2 = new Sy4();
		Sy5 obj3 = new Sy5();
		obj1.DisplayStudentDetail();
		obj2.DisplaySy4();
		obj3.DisplaySy5();
	}
}
