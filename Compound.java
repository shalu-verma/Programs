public class Compound {

  public static void main(String[] args) {
    double principal = 8564;
    double rate = 8; // 8% Per Year
    double term = 5; // 5 Year

    double compoundInterest = principal;

    for (int i = 1; i <= term; i++) {
      compoundInterest = compoundInterest * (1 + (rate / 100));
    }
    System.out.println("Compound Interest: " + compoundInterest);
  }
}
