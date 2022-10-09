
public class ConstructorOverloading {
	
	int age=10;
	String name="roman";
	int salary=15;
	
	ConstructorOverloading(int a, String n)
	{
		age = a;
		name = n;
	}
	ConstructorOverloading(int a, String n, int s)
	{
		age =a;
		name =n;
		salary =s;
	}
	void display()
	{
		System.out.println(age + name+ salary);
	}
	public static void main(String[] args)
	{
		ConstructorOverloading obj = new ConstructorOverloading(22,"kabilan");
		ConstructorOverloading obj1 = new ConstructorOverloading(22, "kabila", 414);
		obj.display();
		obj1.display();
	}
	
	
 
}
