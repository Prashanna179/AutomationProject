
public class basic1 implements Adding{

	public static void main(String[] args) {
			

		int z=0;
		for(int i=0;i<4;i++)
		{
			for(int j=i;j<4;j++)
			{
				z++;
				System.out.print(z+"   ");
			}
			System.out.println();
		}
		System.out.println("*********");
		int x=0;
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				x++;
				System.out.print(x+"  ");
			}
			System.out.println();
		}
		System.out.println("***********");
		
		int f=0;
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				f=f+3;
				System.out.print(f+" ");
			}
			System.out.println();
		}
		
	}
	
	@Override
	public int added()
	{
		return 3+2;
	}
	
	
}
