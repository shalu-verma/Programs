class PerfectNo{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if (n%2==0)
				sum=sum+i;
		}
		if (sum==n)
			System.out.println("perfect no");
		else 
			System.out.println("not a perfect no");
	}
}


	
