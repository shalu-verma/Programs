class Student
{
	private String name;
	private int rollNumber;
	private String dateOfBirth;
	private String eMail;
	private long mobileNo;
	Address address;

	Student(String name,int rollNumber,String dateOfBirth,String eMail,long mobileNo,Address address)
	{
		this.name=name;
	    this.rollNumber=rollNumber;
	    this.dateOfBirth=dateOfBirth;
	    this.eMail=eMail;
	    this.mobileNo=mobileNo;
	    this.address=address;

	}
	void getStudent()
	{
		System.out.println(" name:"+name+" "+"\n rollNumber:"+rollNumber+" "+"\n dateOfBirth:"+dateOfBirth+" "+"\n eMail:"+eMail+" "+"\n mobileNo:"+mobileNo);
		

	}
	
}