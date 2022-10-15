class KeepTrack
{
	public static void main(String[] args)
	{
		int[] arr={0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<100;i++)
		{
			int random = 1+(int)(Math.random()*10);
			//System.out.println(random);
			arr[random] = arr[random]+1;
		}

		for(int i=0;i<=10;i++)
		{
			System.out.println(i+ ": "+arr[i]);
		}
	}
}