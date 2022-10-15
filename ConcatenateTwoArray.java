import java.util.*;
class ConcatenateTwoArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array 1 :");
		int n1=sc.nextInt();
		System.out.print("Enter size of array 2 :");
		int n2=sc.nextInt();

		int a[]=new int[n1];
		System.out.print("Enter array one elements: ");
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}

		int b[]=new int[n2];
		System.out.print("Enter array two elements: ");
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		
        int a_leng=a.length;
		int b_leng=b.length;
		int c_leng=a_leng+b_leng;

		int[] c=new int[c_leng];

		for(int i=0;i<a_leng;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b_leng;i++)
		{
			c[a_leng+i]=b[i];
		}
		System.out.print("Array after concatenation :");

		for(int i=0;i<c_leng;i++)
		{
			System.out.print(c[i]+"  ");
		}



		

	}
}