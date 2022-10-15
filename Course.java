class Course
{
	private String courseName;
	private String courseDuration;
	private String fees;
	private String institute;

	public Course(String courseName, String courseDuration, String fees, String institute ){
		this.courseName=courseName;
		this.courseDuration=courseDuration;
		this.fees=fees;
		this.institute=institute;
	}

	void getCourse(){
		System.out.print("****Course****");
		System.out.println("\n CourseName:"+courseName+" \n courseDuration:"+courseDuration+"\n fees :"+fees+"\n institute :"+institute);
	}

	
}