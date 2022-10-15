interface Time{
    public int getTime();
}


abstract class RateOfInterest implements Time{

  abstract double getRate();

  public int getTime() {
    return 0;
}
}

class SBIBank extends RateOfInterest {

  double getRate() {
    return 12.3;
  }
 
  
  
}

class PNB extends RateOfInterest {

  double getRate() {
    return 23.6;
  }
  
}


public class Abs{
    public static void main(String[] args) {
        
    }
}