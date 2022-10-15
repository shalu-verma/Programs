public class Power {

  public static void main(String[] args) {
    int number = 6;
    int exponent = 5;
    int result = 1;
    for (int i = 0; i < exponent; i++) {
      result = result * number;
    }
    System.out.println(number + " to the power " + exponent + " is: " + result);
  }
}
