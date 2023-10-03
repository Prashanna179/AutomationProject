import java.util.Comparator;
import java.util.TreeSet;

public class DurgaSoftComparableAndComparator {

	public static void main(String[] args) {
		
		//Comparable - Default natural Sorting order
		
		System.out.println("A".compareTo("B"));
		System.out.println("B".compareTo("A"));
		System.out.println("A".compareTo("A"));
		
	
		//Comparator  - Customized sorting
		
		//Write a program to insert integer objects into Treeset : Descending Order
		
		//Default nature sorting order - Ascending . JVM will call comparable interface method CompareTo()
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(5);
		t.add(2);
		t.add(20);
		t.add(20);
		t.add(0);
		System.out.println(t);
		
		
		//Descending Order - Compare() method in Comparator interface
		
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(10);
		t1.add(5);
		t1.add(2);
		t1.add(20);
		t1.add(20);
		t1.add(0);
		System.out.println(t1);
		
		//String - Ascending Order
		TreeSet t2 = new TreeSet();
		t2.add("Prashanna");
		t2.add("Dhivyan");
		t2.add("Letchu");
		t2.add("Prakash");
	
		
		System.out.println(t2);
		
		//String - Descending
		TreeSet t3 = new TreeSet(new MyStringComparator());
		t3.add("Prashanna");
		t3.add("Dhivyan");
		t3.add("Letchu");
		t3.add("Prakash");
		
		System.out.println(t3);

		
		
		
		
	}
}

 class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		
		if(I1<I2)
		{
			return +1;
		}
		else if(I1>I2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
 
 class MyStringComparator implements Comparator
 {

 	@Override
 	public int compare(Object o1, Object o2) {
 		
 		String I1 = (String)o1;
 		String I2 = (String)o2;
 		
 		return I2.compareTo(I1);
 	}
 	
 }
