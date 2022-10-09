
public class Findingmaxandmin {
public static void main(String [] args)
{
	int a[] = {100,250,5,47,87,64};
	
	//int max=a[0];
	//int min=a[0];
	
	for (int i=0; i<a.length; i++)
	{
		for (int j=0; j<i; j--)
		{
			System.out.println(j);
		}
		System.out.println();
	}
}
}
		
		
		
		
		
		
		
		
		
		
		
		
	/*	if(a[i]>max)
			max=a[i];
		if (a[i]<min)
			min=a[i];
	}
	System.out.println("max" + max);
	System.out.println("min" + min);
}
}
*/