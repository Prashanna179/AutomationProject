
public class corejava {

	public static void main(String[] args) {
		
		//Datatypes
		int a =5;
		String name="Prashanna";
		char letter ='a';
		double b = 5.5;
		boolean c = true;
		
	//	System.out.println("value of integer is " + a);
		
		//Arrays
		int arr[] = new int[5];
		arr[0]='5';
		arr[1]='5';
		arr[2]='5';
		arr[3]='5';
		arr[4]='5';
		
		
		int z[]= {1,2,3,4,5};
	//	System.out.println(z[0]);
		
		//for LOOP
		
	/*	for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}
		
		String name1[]= {"Prashanna","Dhivyan","letchu"};
		for(int i=0;i<name1.length;i++)
		{
			System.out.println(name1[i]);
		}
		
		for(int i:z)
		{
			System.out.println(i);
		}
		
		for(String s:name1)
		{
			System.out.println(s);
		}*/
		
		
		int arr2[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		for(int i : arr2)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
				
	}

}
