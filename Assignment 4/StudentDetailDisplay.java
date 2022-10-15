import java.util.Scanner;

public class StudentDetailDisplay {

  public static void main(String[] args) {
    System.out.println("We got Student 1 Data");
    Student student1 = new Student();
    String name1 = args[0];
    long rollNo1 = Long.parseLong(args[1]);
    int age1 = Integer.parseInt(args[2]);
    student1.setData(name1, rollNo1, age1);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Data for Student 2");
    System.out.print("Name: ");
    String name2 = scanner.next();
    System.out.print("RollNo: ");
    long rollNo2 = scanner.nextLong();
    System.out.print("Age: ");
    int age2 = scanner.nextInt();

    Student student2 = new Student();
    student2.setData(name2, rollNo2, age2);

    System.out.println("Student 1 Data: ");
    String st1 = student1.getData();
    System.out.println(st1);
    System.out.println("Student 2 Data: ");
    String st2 = student2.getData();
    System.out.println(st2);
  }
}
