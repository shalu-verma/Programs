import java.util.*;
class ReverseArray
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();

		int a[]= new int[n];
		int i;
		System.out.print("Enter values of array :");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		
		System.out.println("Values of array are :");
		for(i = 0;i<n;i++){                    
			System.out.print(a[i]+" ");
		}
         //for(int u:a)
         	//System.out.println(u+" ");
		System.out.print("\nAfter reversing values of array are:");
        for(i=n-1;i>=0;i--){
        	System.out.print(a[i]+" ");

        }
		
	}

}