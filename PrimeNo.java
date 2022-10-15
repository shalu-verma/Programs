class PrimeNo {

  public static void main(String[] args) {
    int i;
    int n = Integer.parseInt(args[0]);

    int j = 2;
    int counter = 0;

    while (counter < n) {
      int count = 0;
      for (i = 2; i <= j / 2; i++) {
        if (j % i == 0) {
          count++;
        }
      }
      if (count == 0) {
        System.out.println(j);
        counter++;
      }
      j++;
    }
  }
}
