//programme of Hybrid Inheritance

class StudentName
{
	String Name = "Piyush";
}

interface Sy4
{
	int div4=4;
}

interface Sy5
{
	int div5=5;
}

class HybridInheritance extends StudentName implements Sy4,Sy5
{
	public static void main(String args[])
	{
		HybridInheritance obj1=new HybridInheritance();
		System.out.println("\nName : "+obj1.Name+"\nDiv : "+obj1.div4+"\n\nName : "+obj1.Name+"\nDiv : "+obj1.div5+"\n");
	}
}