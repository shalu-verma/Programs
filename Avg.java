import java.util.*;
class Avg 
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
        System.out.println();
		int sum=0;
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];

		}
		float avg=(float)sum/n;
		System.out.println("Avg: "+avg);
		
   


        System.out.println("Highest and lowest number :");

        int max=a[0];
        int min=a[0];
        for(i=0;i<n;i++)
        {
        	if (a[i]>max)
        		max=a[i];
        	if (a[i]<min)
        		min=a[i];
        }
        System.out.println("Highest number: " +max+ " " +"lowest number: "+ min);

}
}

