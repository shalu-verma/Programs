class ElectricityBill
{
	public static void main(String[] args)
	{
		int units=230;
		int userChargesInRs=50;
int billPay;
		if(units<50)
		{
			 billPay=userChargesInRs;
        }
        else if(units<100)
        {
        	billPay=userChargesInRs+(units)*2;
        }
        else if(units<200)
        {
        	billPay=userChargesInRs+(units)*4;
        }
        else 
        {
            billPay=userChargesInRs+(units)*2;
        }
        System.out.println("Bill to pay:" +billPay);


	}
}