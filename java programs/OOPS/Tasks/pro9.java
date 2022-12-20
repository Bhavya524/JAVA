package Tasks;

abstract class Animal {
    abstract void Sound();
  }
  
  class Lion extends Animal {
    void Sound() {
        System.out.println("Lions roaring...");
    }
  }
  
  class Cat extends Animal {
    void Sound() {
        System.out.println("Cat meows");
    }
  }

  class Dog extends Animal {
    void Sound() {
        System.out.println("Dogs barking...");
    }
  }
  
  class pro9 {
    public static void main(String[] args) {
      Animal myLion = new Lion();  // Create a Lion object
      Animal myCat = new Cat(); // Create a Cat object
      Animal myDog = new Dog();  // Create a Dog object
      myLion.Sound();
      myCat.Sound();
      myDog.Sound();

    }
  }