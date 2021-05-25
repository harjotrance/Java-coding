package codingSection7;

public class printer {

        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;



        public printer(int tonerLevel, boolean duplex) {

            if(tonerLevel>-1 && tonerLevel<=100) {
                this.tonerLevel = tonerLevel;
            }
            else {
                this.tonerLevel = -1;
            }


            this.duplex = duplex;


            this.pagesPrinted = 0;

        }


        public int addToner(int tonerAmount) {
            if (tonerAmount > 0 && tonerAmount <= 100) {
                if (tonerAmount + tonerLevel <= 100) {
                    this.tonerLevel += tonerAmount;
                    return this.tonerLevel;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }


        public int printPages(int pages){
            int pagesToPrint=pages;
            if (duplex){
                pagesToPrint=(pages/2)+(pages%2);
                System.out.println("Printing pages in duplex mode");
            }
            this.pagesPrinted+=pagesToPrint;
            return pagesToPrint;
        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }

}
