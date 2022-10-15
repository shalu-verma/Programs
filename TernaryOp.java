class TernaryOp{
	public static void main(String[] args)
	{
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);

		int max= x>y? x:y ;

		System.out.println(+max);


	}
}