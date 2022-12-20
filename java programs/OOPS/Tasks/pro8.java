package Tasks;

class Animal {
    public void Sound() {
      System.out.println("Different animal sounds different way");
    }
  }
  
  class Lion extends Animal {
    public void Sound() {
        System.out.println("Lions roaring...");
    }
  }
  
  class Cat extends Animal {
    public void Sound() {
        System.out.println("Cat meows");
    }
  }

  class Dog extends Animal {
    public void Sound() {
        System.out.println("Dogs barking...");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Animal myLion = new Lion();  // Create a Lion object
      Animal myCat = new Cat(); // Create a Cat object
      Animal myDog = new Dog();  // Create a Dog object
      myLion.Sound();
      myCat.Sound();
      myDog.Sound();

    }
  }