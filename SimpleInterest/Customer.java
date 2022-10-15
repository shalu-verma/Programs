package SimpleInterest;
 

public class Customer {

  private String name;
  private String idNumber;
  private String dateOfBirth;
  private String eMail;
  private long mobileNo;
  Address address;

  Customer(
    String name,
    String idNumber,
    String dateOfBirth,
    String eMail,
    long mobileNo,
    Address address
  ) {
    this.name = name;
    this.idNumber = idNumber;
    this.dateOfBirth = dateOfBirth;
    this.eMail = eMail;
    this.mobileNo = mobileNo;
    this.address = address;
  }

  void disp() {
    System.out.println(
      " name:" +
      name +
      " " +
      "\n idNumber:" +
      idNumber +
      " " +
      "\n dateOfBirth:" +
      dateOfBirth +
      " " +
      "\n eMail:" +
      eMail +
      " " +
      "\n mobileNo:" +
      mobileNo
    );
  }
}
