interface Animal{            // Interface class
   public void sound();     // Abstract method
   public void animaSound(); // Abstract method
}

class Dog implements Animal{
    public void sound(){System.out.println("This is Dog");}

    public void animaSound(){
      System.out.println("This is animaSound");
    }
}
    class Main{
      public static void main(String[] args) {
        Animal obj=new Dog();
               obj.sound();
               obj.animaSound();
      }
    }