import java.util.Scanner;

public class StudentDisplayQuestion2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Data for Student");
    System.out.print("Name: ");
    String name = scanner.next();
    System.out.print("RollNo: ");
    long rollNo = scanner.nextLong();
    System.out.print("Age: ");
    int age = scanner.nextInt();

    Student student = new Student();
    student.setData(name, rollNo, age);
    System.out.println("Student Data: ");
    String st = student.getData();
    System.out.println(st);
    /* 
    st.getAge(); // private member not accessible
    st.getRollNo(); // protected member not accessible
    */
  }
}

