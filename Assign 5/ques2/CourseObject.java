public class CourseObject {

  public static void main(String[] args) {
    Course course1 = new Course();
    course1.setData("PGDAI", "AI", 6, 87452);
    Course course2 = new Course();
    course2.setData("PGDESD", "DESD", 6, 85463);
    Course course3 = new Course();
    course3.setData("VLSI", "DVLSI", 6, 98563);
    Course course4 = new Course("PGDAC", "DAC", 6, 78545);
    Course course5 = new Course("PGDESD", "DESD", 6, 84627);

    System.out.println(course1.getData());
    System.out.println(course2.getData());
    System.out.println(course3.getData());
    System.out.println(course4.getData());
    System.out.println(course5.getData());
  }
}
