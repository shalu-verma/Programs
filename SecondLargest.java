import java.util.*;
class SecondLargest
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int a[]= new int[n];
		int i,j;
		System.out.print("Enter values of array :");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		
		System.out.println("Values of array are :");
		for(i = 0;i<n;i++)
		{                    
			System.out.print(a[i]+" ");
		}
         //for(int u:a)
         	//System.out.println(u+" ");
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==1)
			{
				break;
			}
			
			
		}
		System.out.println("\n Values of array in decending order upto index 1 are :");
		for(i = 0;i<n;i++)
		{                    
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n largest number :"+ a[0]);
		System.out.println("\n Second largest number :"+ a[1]);    
		
	}


	
}
