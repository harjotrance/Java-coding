package codingSection9;

public class interFace2 {
    interface FirstInterface {
        public void myMethod(); // interface method
    }

    interface SecondInterface {
        public void myOtherMethod(); // interface method
    }

    static class DemoClass implements FirstInterface, SecondInterface {
        public void myMethod() {
            System.out.println("Some text..");
        }
        public void myOtherMethod() {
            System.out.println("Some other text...");
        }
    }
      public static void main(String[] args) {
            DemoClass myObj = new DemoClass();
            myObj.myMethod();
            myObj.myOtherMethod();

    }

}
