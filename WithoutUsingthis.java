
public class WithoutUsingthis {

	int age;
	String name;
	float sal;
	
	WithoutUsingthis(int age, String name)
	{
		age =age;
		name = name;
	}
	WithoutUsingthis(int age, String name, float sal)
	{
		age=age;
		name=name;
		sal=sal;
		
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