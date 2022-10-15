class Counter
{
	public static void main(String[] args)
	{
		int values[] = new int [10];
		int counter = 1;
        values[0] = 10;
        values[counter] = counter;
        counter++;
        values[5] = counter;
        values[9] = values[5] + counter;
        values[counter] = values[9] - values[1];
        values[9] += ++counter;
		System.out.println("Result: ");
		for (int x:values)
			System.out.print(x+" ");

	}
	
}