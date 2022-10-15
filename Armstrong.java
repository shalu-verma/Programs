class Armstrong {

  public static void main(String[] args) {
    int sum = 0, r, armstrong;
    int n = Integer.parseInt(args[0]);
    armstrong = n;
    while (n != 0) {
      r = n % 10;
      sum = sum + (r * r * r);
      n = n / 10;
    }
    if (armstrong == sum) {
      System.out.println(armstrong + " " + " is a armstrong number");
    } else {
      System.out.println(armstrong + " " + " is not a armstrong number");
    }
  }
}
