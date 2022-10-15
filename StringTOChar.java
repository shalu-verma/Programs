import java.util.Scanner;

class StringTOChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char charArray[] = new char[str.length()];
		
		for (int i =0;i<str.length() ;i++ ) {
			charArray[i]=str.charAt(i);	
		}
		System.out.println(charArray);
	}	
}