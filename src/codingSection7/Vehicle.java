package codingSection7;

public class Vehicle {

    public static class Car {

        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels;


        public Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
            this.engine=true;
            this.wheels=4;
        }

        public String startEngine(){
            return "Car -> startEngine()";
        }

        public String accelerate(){
            return "Car -> accelerate()";
        }

        public String brake(){
            return "Car -> brake()";
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }
    }

    public class Mitsubishi extends Car {
        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }


        public String startEngine(){
            return "Mitsubishi -> startEngine()";
        }

        public String accelerate(){
            return "Mitsubishi -> accelerate()";
        }

        public String brake(){
            return "Mitsubishi -> brake()";
        }
    }

    public class Holden extends Car{
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }


        public String startEngine(){
            return "Holden -> startEngine()";
        }

        public String accelerate(){
            return "Holden -> accelerate()";
        }

        public String brake(){
            return "Holden -> brake()";
        }
    }
    public class Ford extends  Car{
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }


        public String startEngine(){
            return "Ford -> startEngine()";
        }

        public String accelerate(){
            return "Ford -> accelerate()";
        }

        public String brake(){
            return "Ford -> brake()";
        }
    }

}
