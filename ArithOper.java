class ArithOper{
	public static void main(String[] args)
	{
		int a= Integer.parseInt(args[0]);
		char op = args[1].charAt(0);
		int b = Integer.parseInt(args[2]);

		System.out.print(a + " " + op +" "+b +" = ");

		switch(op){
		case '+': 
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b); 
			break;
		case '*': 
			System.out.println(a*b);
			break;
		case '/': 
			System.out.println(a/b);
			break;
		}

	}
}