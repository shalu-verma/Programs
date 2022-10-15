import java.util.*;
class Can
{
	public static void main(String[] args)
	{
		int[] gradeTotal=new int[3];
		int totalCans=0;
		char choice='Y';
		Scanner sc=new Scanner (System.in);
		

		while(choice=='Y' || choice == 'y')
		{
			System.out.println("Enter Grade 1 OR 2 OR 3");
			int grade = sc.nextInt();


			if(grade>3 || grade < 1){

				System.out.println("You have not entered right grade");

			}else{
				System.out.println("Enter Number of cans");
				int cans = sc.nextInt();



				if(grade == 1){
					gradeTotal[0] = gradeTotal[0]+cans;
				}
				if(grade == 2){
					gradeTotal[1] = gradeTotal[1]+cans;
				}
				if(grade  == 3){
					gradeTotal[2] = gradeTotal[2]+cans;
				}

				totalCans = totalCans +cans;
			}

			System.out.println("Do you want to continue:Y/N");
			choice = sc.next().charAt(0);
		}
		System.out.println("Total Cans: "+totalCans);
		for(int i=0;i<3;i++){
			System.out.println("Garde "+(i+1)+" : "+ gradeTotal[i]);
		}

	}
}