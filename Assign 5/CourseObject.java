import java.util.Scanner;

public class CourseObject {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of courses");
    int n;
    n = sc.nextInt();
    Course courses[] = new Course[n];
    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.out.println("Enter Details for course " + (i + 1));
      System.out.println("Enter Course Id:");
      String id = sc.nextLine();
      System.out.println("Enter Course Desciption:");
      String desciption = sc.nextLine();
      System.out.println("Enter Course Duration:");
      int duration = sc.nextInt();
      System.out.println("Enter Course Fees:");
      int fee = sc.nextInt();
      Course course = new Course(id, desciption, duration, fee);
      courses[i] = course;
    }

    //for Printing data

    for (Course iCourse : courses) {
      System.out.println(iCourse.getData());
    }
  }
}
