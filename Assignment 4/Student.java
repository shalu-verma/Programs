public class Student {

  private String name;
  private long rollNo;
  private int age;

  void setData(String name, long rollNo, int age) { // default access modifier 
    this.name = name;
    this.rollNo = rollNo;
    this.age = age;
  }

  private int getAge() { // private access modifier 
    return age;
  }

  protected long getRollno() { // protected access modifier
    return rollNo;
  }

  public String getData() { // public access modifier 
    return (
      "Name: " + this.name + " Age: " + this.age + " RollNo.: " + this.rollNo
    );
  }
}
