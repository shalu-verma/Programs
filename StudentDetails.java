class StudentDetails
{
	public static void main(String[] args)
	{
		Address a1=new Address(546,"C-DAC Street","Hardware Park","HYD",501510);
		Student s1=new Student("Shalu",29,"13_march_1993","shaluverma13@gmail.com",94534856,a1);
		Course c1=new Course("C-DAC","6_months","1_lakh","C-DAC HYD Institute");

		s1.getStudent();
		c1.getCourse();
		a1.getAddress();

	}
	
}