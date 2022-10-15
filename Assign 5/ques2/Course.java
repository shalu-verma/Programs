public class Course {

  private String id;
  private String description;
  private int duration;
  private int fees;

  Course() {}

  Course(String id, String description, int duration, int fees) {
    this.id = id;
    this.description = description;
    this.duration = duration;
    this.fees = fees;
  }

  void setData(String id, String description, int duration, int fees) {
    this.id = id;
    this.description = description;
    this.duration = duration;
    this.fees = fees;
  }

  public String getData() {
    return (
      "Id: " +
      this.id +
      " Description: " +
      this.description +
      " duration: " +
      this.duration +
      " fees: " +
      this.fees
    );
  }
}
