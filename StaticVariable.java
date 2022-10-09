
public class StaticVariable {
	
	int age;
String name ;
static float salary =142.007f;

StaticVariable(int a, String n)
{
age = a;
name =n;

}
void siplay()
{
	System.out.println(age + name + salary);
}
public static void main(String[] args)
{
	StaticVariable obj = new StaticVariable (22, "kabis");
	obj.siplay();
}

}
