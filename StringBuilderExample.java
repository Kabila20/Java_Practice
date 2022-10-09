
public class StringBuilderExample {
void show()
{
	StringBuilder obj = new StringBuilder("Kabilan");
	//System.out.println(obj);
	//obj.append("you are a champion");
	//System.out.println(obj);
	obj.delete(1, 5);
	System.out.println(obj);
	//obj.reverse();
	//System.out.println(obj);
	//obj.insert(1, "Hell");
	//System.out.println(obj);
}
	
	public static void main(String[] args)
	{
		StringBuilderExample obj = new StringBuilderExample();
		obj.show();
	}
	
}
