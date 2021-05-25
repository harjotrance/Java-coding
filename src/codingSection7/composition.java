package codingSection7;

public class composition {

    public class Bedroom {
        private String name;
        private  Wall wall1;
        private  Wall wall2;
        private  Wall wall3;
        private  Wall wall4;
        private  Ceiling ceiling;
        private Bed bed;
        private Lamp lamp;

       public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
            this.name = name;
            this.wall1 = wall1;
            this.wall2 = wall2;
            this.wall3 = wall3;
            this.wall4 = wall4;
            this.ceiling = ceiling;
            this.bed = bed;
            this.lamp = lamp;
        }

        public void makeBed(){
            System.out.println("Bedroom -> Making bed | ");
            bed.make();
        }


         public String getName() {
             return name;
         }

         public Wall getWall1() {
             return wall1;
         }

         public Wall getWall2() {
             return wall2;
         }

         public Wall getWall3() {
             return wall3;
         }

         public Wall getWall4() {
             return wall4;
         }

         public Ceiling getCeiling() {
             return ceiling;
         }

         public Bed getBed() {
             return bed;
         }

        public Lamp getLamp() {
            return lamp;
        }

    }

    public class Wall {
        //    Creating fields
        private String direction;

        //    Crating constructor
        public Wall(String direction) {
            this.direction = direction;
        }
//    Creating getter method

        public String getDirection() {
            return direction;
        }

    }

    public class Ceiling {

        private int height;
        private int paintedColor;

        //    Creating Constructor
        public Ceiling(int height, int paintedColor) {
            this.height = height;
            this.paintedColor = paintedColor;
        }

//    Creating getters method

        public int getHeight() {
            return height;
        }

        public int getPaintedColor() {
            return paintedColor;
        }

    }
    public class Bed {

        private String style;
        private int pillows;
        private int height;
        private int sheets;
        private int quilt;



        public Bed(String style, int pillows, int height, int sheets, int quilt) {
            this.style = style;
            this.pillows = pillows;
            this.height = height;
            this.sheets = sheets;
            this.quilt = quilt;
        }

        public void make(){
            System.out.println("Bed -> Making | ");
        }



        public String getStyle() {
            return style;
        }

        public int getPillows() {
            return pillows;
        }

        public int getHeight() {
            return height;
        }

        public int getSheets() {
            return sheets;
        }

        public int getQuilt() {
            return quilt;
        }

    }

    public class Lamp {

        private String style;
        private boolean battery;
        private int globRating;



        public Lamp(String style, boolean battery, int globRating) {
            this.style = style;
            this.battery = battery;
            this.globRating = globRating;
        }
        public void turnOn(){
            System.out.println("Lamp -> Turning on");
        }
        public boolean isBattery(){
            return battery;
        }

        public String getStyle() {
            return style;
        }

        public int getGlobRating() {
            return globRating;
        }

    }
}
