import java.lang.*;
class CharArrayToString
{
	public static void main(String[] args)
	{
		char charArray[]=new char[]{'b','o','x'};
		//String str=String.valueOf(charArray);
		String str=new String(charArray);
		System.out.println("String:"+str);
	}
}