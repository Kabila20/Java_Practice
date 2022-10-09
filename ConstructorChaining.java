
public class ConstructorChaining {
	
	int age;
	String name;
	float sal;
	
	ConstructorChaining()
	{
		int b=25;
		System.out.println(b);
	}
	ConstructorChaining(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	ConstructorChaining(int age, String name, float sal)
	{
		this.age=age;
		this.name=name;
		this.sal=sal;
	}
	
	void show()
	{
		System.out.println(age+name+sal);
	}
	public static void main(String[] args)
	{
		ConstructorChaining obj = new ConstructorChaining(22,"kabilan",14.5f);
		obj.show();
	}

}
