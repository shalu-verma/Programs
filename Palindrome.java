class Palindrome {

  public static void main(String[] args) {
    int rev = 0, rem, pal;
    int n = Integer.parseInt(args[0]);
    pal = n;
    while (n != 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    if (pal == rev) System.out.println(
      pal + " " + " is a palindrome number"
    ); else System.out.println(pal + " " + " is not a palindrome number");
  }
}
