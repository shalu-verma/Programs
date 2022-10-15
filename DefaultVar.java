import java.util.*;
class DefaultVar
{
	static int a;
	static float b;
	static double c;
	static String d;
	static boolean e;
	static long f;

	int NewInt;
	float NewFloat;
	double NewDouble;
	String NewString;
	boolean NewBoolean;
	long NewLong;


	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		DefaultVar obj=new DefaultVar();

		System.out.println(obj.NewInt);
		System.out.println(obj.NewFloat);
		System.out.println(obj.NewDouble);
		System.out.println(obj.NewString);
		System.out.println(obj.NewBoolean);
		System.out.println(obj.NewLong);


	}

	
}
