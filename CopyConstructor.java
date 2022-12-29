//Programme of Copy constructor

class CopyConstructor
{
	int rno;
	String name;
	CopyConstructor(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}

	//Copy Constructor Code
	CopyConstructor(CopyConstructor cp)
	{
		this.rno=cp.rno;
		this.name=cp.name;
	}

	public static void main(String arg[])
	{
		CopyConstructor cp=new CopyConstructor(574,"Piyush");
		System.out.println("\nRno : "+cp.rno+"\nName : "+cp.name+"\n");
		System.out.println("After Copy Constructor ... !");
		CopyConstructor Copied_cp = new CopyConstructor(cp);
		System.out.println("\nCopied Rno : "+Copied_cp.rno+" and Name is : "+Copied_cp.name);
	}
}