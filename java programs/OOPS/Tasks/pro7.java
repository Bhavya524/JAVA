package Tasks;

abstract class RBI {
    abstract void getRateOfInterest() ;
  }
  
  class SBI extends RBI {
    void getRateOfInterest() {
        float interestSBI = 5.4f;
        System.out.println("Interest of SBI "+interestSBI);
    }
  }
  
  class AXIS extends RBI {
    void getRateOfInterest() {
        float interestAXIS = 7.44f;
        System.out.println("Interest of AXIS "+interestAXIS);
    }
  }

  class HDFC extends RBI {
    void getRateOfInterest() {
        float interestHDFC = 9.23f;
        System.out.println("Interest of HDFC "+interestHDFC);
    }
  }
  
  class pro7 {
    public static void main(String[] args) {
      RBI mySBI = new SBI();  // Create a SBI object
      RBI myAXIS = new AXIS(); // Create a AXIS object
      RBI myHDFC = new HDFC();  // Create a HDFC object
      mySBI.getRateOfInterest();
      myAXIS.getRateOfInterest();
      myHDFC.getRateOfInterest();

    }
  }