class AddUsingMethods {

  public static void main(String args[]) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    Addition add = new Addition(x, y);

    int sum = add.addWithArgsAndReturn(x, y);
    System.out.println("Addition with Args And Return: " + sum);

    add.addWithArgsAndNoReturn(x, y);

    int sum2 = add.addwithNoArgsAndReturn();
    System.out.println("Addition with No Args And Return: " + sum2);

    add.addwithNoArgsNoReturn();
  }
}

class Addition {

  int x;
  int y;

  Addition(int x1, int y1) {
    x = x1;
    y = y1;
  }

  public int addWithArgsAndReturn(int a, int b) {
    return a + b;
  }

  public void addWithArgsAndNoReturn(int a, int b) {
    System.out.println("Addition With Args And NoReturn: " + (a + b));
  }

  public int addwithNoArgsAndReturn() {
    return x + y;
  }

  public void addwithNoArgsNoReturn() {
    System.out.println("Addition With NoArgs And NoReturn: " + (x + y));
  }
}
