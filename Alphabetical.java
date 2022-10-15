import java.util.*;
class Alphabetical 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n;
		n=sc.nextInt();
		String a[]=new String[n];
		String temp;
		System.out.print("Enter word in array :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo (a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if (flag==0)
				break;
		}
		for( int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}


	}
}