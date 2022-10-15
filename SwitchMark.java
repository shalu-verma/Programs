public class SwitchMark {

 public static void main(String[] marks) {
    int m1 = Integer.parseInt(marks[0]);
    int m2 = Integer.parseInt(marks[1]);
    int m3 = Integer.parseInt(marks[2]);
    int per = (m1 + m2 + m3) / 30;
    switch (per) {
      case 10:
        System.out.println("Distinction");
        break;
      case 9:
        System.out.println("Distinction");
        break;
      case 8:
        System.out.println("Grade=A");
        break;
      case 7:
        System.out.println("Grade=B");
        break;
      case 6:
        System.out.println("Grade=C");
        break;
      case 5:
        System.out.println("Grade=D");
        break;
      case 4:
        System.out.println("Grade=E");
        break;
      default:
        System.out.println("YOU FAILED,TRY NEXT TIME");
    }
  }
}
