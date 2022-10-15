class SqRoot {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int i;
    boolean flag = false;
    for (i = 1; i <= n; i++) {
      int sqRoot = n / i;
      if (sqRoot == i && n % i == 0) {
        System.out.println("Square root of " + n + " is:" + sqRoot);
        flag = true;
        break;
      }
    }
    if (!flag) {
      System.out.println("Perfect Square root of " + n + " is not possible");
    }
  }
}
