package Tasks;

class RBI1 {
    public void getRateOfInterest() {
        float interestRBI = 0;
      System.out.println("Interest of RBI "+interestRBI);
    }
  }
  
  class SBI1 extends RBI1 {
    public void getRateOfInterest() {
        float interestSBI = 5.4f;
        System.out.println("Interest of SBI "+interestSBI);
    }
  }
  
  class AXIS1 extends RBI1 {
    public void getRateOfInterest() {
        float interestAXIS = 7.44f;
        System.out.println("Interest of AXIS "+interestAXIS);
    }
  }

  class HDFC1 extends RBI1 {
    public void getRateOfInterest() {
        float interestHDFC = 9.23f;
        System.out.println("Interest of HDFC "+interestHDFC);
    }
  }
  
  class pro6 {
    public static void main(String[] args) {
      RBI1 myRBI = new RBI1();  // Create a RBI object
      RBI1 mySBI = new SBI1();  // Create a SBI object
      RBI1 myAXIS = new AXIS1(); // Create a AXIS object
      RBI1 myHDFC = new HDFC1();  // Create a HDFC object
      myRBI.getRateOfInterest();
      mySBI.getRateOfInterest();
      myAXIS.getRateOfInterest();
      myHDFC.getRateOfInterest();

    }
  }