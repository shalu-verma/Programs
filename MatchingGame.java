import java.util.*;


class MatchingGame
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		int randomNumber = (int)(Math.random()*100);
		do{
			if(a>randomNumber){
			 	System.out.println("Too High");
			}
			if(a<randomNumber){
			 	System.out.println("Too Low");
			}
			if(a!=randomNumber){
				System.out.println("Enter Again :");
				a=sc.nextInt();
			}
			 
		}while(randomNumber!=a);

		System.out.println("Matched");
	}
}