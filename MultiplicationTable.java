class MultiplicationTable {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    int mult;
    for (int j = n; j <= m; j++) {
      for (int i = 1; i <= 10; i++) {
        mult = j * i;
        System.out.print(j + "*" + i + "=" + mult + " ");
      }
      System.out.println();
	  System.out.println();
    }
  }
}
