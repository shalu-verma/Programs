class AddFifthMethod
{
	static void add(int...x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		add(123,456);

	}
	
}