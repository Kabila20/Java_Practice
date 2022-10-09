
public class WithUsingthis {

	int age;
	String name;
	float sal;
	
	/*WithUsingthis(int age, String name)
	{
		this.age =age;
		this.name = name;
	}*/
	WithUsingthis(int age, String name, float sal)
	{
		this.age=age;
		this.name=name;
		this.sal=sal;
		
	}
	void display()

{
	System.out.println(age+name+sal);
}
	public static void main(String[] args)

	{
		WithoutUsingthis obj = new WithoutUsingthis(22,"kab");
		WithoutUsingthis obj1 = new WithoutUsingthis(22, "kabs", 14.04f);
		obj.display();
		obj1.display();
	}
}