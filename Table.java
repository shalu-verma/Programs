class Table {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println("the table is:");
    for (int i = 1; i <= 10; i++) {
      int t = n * i;
      System.out.println(n + " * " + i + " = " + t);
    }
  }
}
