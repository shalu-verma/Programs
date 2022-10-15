import java.util.Scanner;
class AddMatrix
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of row and column: ");
        int r=sc.nextInt();
		int c=sc.nextInt();
        
        int a[][]=new int[r][c];
       
        System.out.print("Enter elements of matrix 1: ");
        int i,j;
        for(i=0;i<r;i++)
        {
        	for(j=0;j<c;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}

        }
        
        int b[][]=new int[r][c];

        System.out.print("Enter elements of matrix 2: ");
        for(i=0;i<r;i++)
        {
        	for(j=0;j<c;j++)
        	{
        		b[i][j]=sc.nextInt();
        	}

        }
        
        int c1[][]=new int[r][c];

		System.out.println("Addition is: ");
        for(i=0;i<r;i++)
        {
        	for(j=0;j<c;j++)
        	{
        		c1[i][j]=a[i][j]+b[i][j];
        		System.out.print(c1[i][j] +" ");
        	}
        	
        	System.out.println();
        }
	}
}