
public class StringBufferExample {
void display()
{
	StringBuffer obj = new StringBuffer("Its my game");
	System.out.println(obj);
	obj.append("  never give up");
	System.out.println(obj);
//	obj.reverse();
	//System.out.println(obj);
	obj.insert(0, " hell  ");
	System.out.println(obj);
	obj.delete(0, 5);
	System.out.println(obj);
	
	
}
public static void main(String[] args)
{
	StringBufferExample ob = new StringBufferExample();
	ob.display();
}
}
