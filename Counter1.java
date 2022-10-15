public class Counter1
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
		
		System.out.println("Original Array: ");
		for (int x:values)
			System.out.print(x+" ");
		System.out.println("\nReversed Array: ");
		for(int i=values.length-1;i>=0;i--){
			System.out.print(values[i]+" ");
		}


	}
	
}