import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//minimum number in an array
		int a[]= {25, 11, 7, 75, 56,3};
		int min =a[0];
		
		for(int i=0;i<a.length;i++)
		{	
			
			if(a[i]<min)
				{
					min=a[i];
				}
				
		}
		
		System.out.println(min);
		
		System.out.println("**********");
		
		String sss[]= {"Prashan","Dhiv","Letchu","Prakash"};
		List<String> aaa = Arrays.asList(sss);
		
		aaa.stream().filter(s->s.startsWith("P")).forEach(s->System.out.print(s+" "));
		
		System.out.println();
		//Reverse a string
		
		String ss = "Prashanna";
		
		for(int i=ss.length()-1;i>=0;i--)
		{	
		System.out.print(ss.charAt(i));	
		}
		
		System.out.println("");
		
		char aa[]=ss.toCharArray();
		for(int i=aa.length-1;i>=0;i--)
		{
			System.out.print(aa[i]);
		}
		
		System.out.println();
		System.out.println("**********");
		
		//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number
		
		int p[]={4, 6, 5, -10, 8, 5, 20};
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
				{
					if(p[i]+p[j]==10)
					{
						System.out.println(p[i] +"+"+ p[j] +"="+"10");
					}
				}
		
		}
		System.out.println("**********");
		
		
		//reverse the array and store it in the same array
		
		int cc[]= {1,2,3,4};
		int temp;
		for(int i=0;i<cc.length/2;i++)
		{
			temp=cc[i];
			cc[i]=cc[cc.length-i-1];
			cc[cc.length-i-1]=temp;
		}
		
		List<Integer> LL = Arrays.stream(cc).boxed().collect(Collectors.toList());
		LL.forEach(s->System.out.println(s));
		
		System.out.println("******************");
		
		//
		
		Integer cd= 123;
		String cdd = cd.toString();
		int sum=0;
		int size = cdd.length();
		for(int i=0;i<size;i++)
		{	
			int base = Integer.parseInt(String.valueOf(cdd.charAt(i)));
			System.out.println(base);
			sum = sum + (int)Math.pow(base,size);
		}
		System.out.println(sum);
		
		
		System.out.println("******************");
		
		
		Integer dd=123;
		Integer count=dd.toString().length();
		int sumdd=0;
		while(dd%10!=0) {
			int base=dd%10;
			sumdd = sumdd + (int)Math.pow(base,count);
			dd=dd/10;	
		}
		
		System.out.println(sumdd);
		
		System.out.println("******************");
		
		int ee = 120;
		int count1=0;
		while(ee%10!=0)
		{
			count1++;
			ee=ee/10;
		}
		System.out.println(count1);
		
		
		
		
		//Reverse a number
		
		int tt=1234;
	
			String stt = ((Integer)tt).toString();
			
			for(int i=stt.length()-1;i>=0;i--)
			{
				System.out.print(stt.charAt(i));
			}
			
			
		
}
}
