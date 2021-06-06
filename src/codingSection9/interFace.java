package codingSection9;

public class interFace {
    // Interface
    interface Animal {
        public void animalSound();
        public void sleep(); //
    }

    // Pig "implements" the Animal interface
    static class Pig implements Animal {
        public void animalSound() {

            System.out.println("The pig says: wee wee");
        }
        public void sleep() {

            System.out.println("Zzz");
        }
    }


    public static void main(String[] args) {
            Pig myPig = new Pig();
            myPig.animalSound();
            myPig.sleep();
    }


}
