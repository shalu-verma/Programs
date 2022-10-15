class Employee
{
	String empId;
	String empName;
	int empSalery;
	String empPost;
	int empAge;
	String empJoin;
	long empMobile;
	String empAddress;
	String empDept;
	char empGender;
	String empEmail;



	void setEmployee(String I,String N,int S,String P,int A,String J,long M,String Ad,String D,char G,String E){
	empId=I;
    empName=N;
	empSalery=S;
    empPost=P;
	empAge=A;
	empJoin=J;
	empMobile=M;
	empAddress=Ad;
	empDept=D;
	empGender=G;
	empEmail=E;
}
    void getEmployee(){
    	System.out.println(empId+" "+empName+" "+empSalery+" "+empPost+" "+empAge+" "+empJoin+" "+empMobile+" "+empAddress+" "+empDept+" "+empGender+" "+empEmail);

    }
    public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setEmployee("ASD123"," siya", 50000,"Assistant Engineer", 30, "21_March_2021",9455587,"z-2/145","jal",'f',"siya@gmail.com");
		e1.getEmployee();

	}
}