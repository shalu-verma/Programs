import java.util.Scanner;

class StringTOChar2
{
	public static void main(String[] args)
	{
		System.out.println("Enter any String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char charArray[] = new char[str.length()];
		
		for (int i =0;i<str.length() ;i++ ) {
			charArray[i]=str.charAt(i);	

		}
		System.out.println("String in Array: ");
		System.out.println(charArray);


        System.out.println("Enter an character you want to replace");
        char x=sc.next().charAt(0);
        System.out.println("Enter an character you want to replace with");
        char y=sc.next().charAt(0);


		for(int j=0;j<charArray.length;j++){
		
			if(charArray[j] ==x)	{
				charArray[j]=y;
			}	
		}
		System.out.println("String After Character Replace");
		System.out.println(charArray);


	}	
}