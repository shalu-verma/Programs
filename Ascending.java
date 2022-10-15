import java.util.*;
class Ascending
{
	public static void main(String[] args)
	{
		int arr[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter five numbers");
		
		boolean flag = true;

		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
			if(i!=0){
				if(arr[i-1]<=arr[i] )
				{
					flag= flag && true;
				}	
				if(arr[i-1]>arr[i]){

					flag = flag && false;
				}
			}
			
		}

		if(flag)
			System.out.println("numbers are in ascending order");
		else
			System.out.println("numbers are not in ascending order");
	}
}