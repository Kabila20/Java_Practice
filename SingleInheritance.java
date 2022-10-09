
 class  SingleInheritance {
	void display()
	{
	int a=10;
	String name="kabi";
	System.out.println(a+name);
	}



 class   childClass extends SingleInheritance 
{
	public void show()
	{
		System.out.println("hello");
	}

	public static void main(String[] args)
	{
	SingleInheritance obj = new SingleInheritance();
	((SingleInheritance.childClass) obj).show();
	obj.display();
	}

	 
}



}