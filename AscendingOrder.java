import java.util.*;
class AscendingOrder
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
				int temp;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		System.out.println("\n Values of array in ascending order are :");
		for(i = 0;i<n;i++)
		{                    
			System.out.print(a[i]+" ");
		}
		

        
		
	}


	
}