class Area {

  double r = 1;
  double pi = 3.14f;
  double area = pi * r * r;
}

class Circ {

  double r = 8;
  double pi = 3.14f;
  double circ = 2 * pi * r;
}

public class CircleArea {

  public static void main(String[] args) {
    Area calc = new Area();
    Circ calc1 = new Circ();
    System.out.println(calc.area);
    System.out.println(calc1.circ);
  }
}
