class Customer
{
	private String name;
	private String idNumber;
	private String dateOfBirth;
	private String eMail;
	private long mobileNo;
	Address address;
	Customer(String name,String idNumber,String dateOfBirth,String eMail,long mobileNo,Address address)
	{
		this.name=name;
	    this.idNumber=idNumber;
	    this.dateOfBirth=dateOfBirth;
	    this.eMail=eMail;
	    this.mobileNo=mobileNo;
	    this.address=address;

	}
	void getCustomer()
	{
		System.out.println(" name:"+name+" "+"\n idNumber:"+idNumber+" "+"\n dateOfBirth:"+dateOfBirth+" "+"\n eMail:"+eMail+" "+"\n mobileNo:"+mobileNo);
		

	}
	
}

class Account{
    private String accountType;
	private long accountNumber;
	private double minimumBalance;

	Account(String accountType,long accountNumber,double minimumBalance)
	{
		this.accountType=accountType;
		this.accountNumber=accountNumber;
		this.minimumBalance=minimumBalance;
	   
    }
    void disp()
    {
    	System.out.println("AccountType :"+accountType+" "+"\n AccountNumber:"+accountNumber+" "+"minimumBalance :"+minimumBalance);
    }

	

	public void simpleInterest(){
		double principal=10000;
		float rateOfInterest=7;
		int time=2;
		double simpleInterest=(principal*rateOfInterest*time)/100;
		System.out.println("Simple Interest:"+simpleInterest);

	}
}

public class EmpSI{
	public static void main(String[] args)
	{
		Address a1=new Address(546,"C-D","AC Street Hardware Park","HYD",501510);
		Customer s1=new Customer("Shalu","wb12356","8_May_1997","shaluverma13@gmail.com",94534856,a1);
		
		Account si=new Account(
			"saving",
			12378909,
			2454.6
		);

        a1.getAddress();
        System.out.println("****Customer Detail****");
		s1.getCustomer();
		System.out.println("****Simple Interest****");
		si.simpleInterest();
	}
}

