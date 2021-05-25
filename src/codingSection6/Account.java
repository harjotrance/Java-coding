package codingSection6;

public class Account {

        private int accountNumber;
        private int balance;
        private String customerName;
        private String email;
        private long phoneNumber;


        public Account(int accountNumber,int balance,String customerName,String email,long phoneNumber){
            this.accountNumber=accountNumber;
            this.balance=balance;
            this.customerName=customerName;
            this.email=email;
            this.phoneNumber=phoneNumber;
        }



        public Account(){

            this(0,0,"Default Customer Name","Default email",0);
            System.out.println("Empty Constructor Called!!");
        }

        public void setAccountNumber(int accountNumber){
            this.accountNumber=accountNumber;
        }
        public int getAccountNumber(){
            return accountNumber;
        }

        public void setBalance(int balance){
            this.balance=balance;
        }
        public int getBalance(){
            return balance;
        }

        public void setCustomerName(String customerName){
            this.customerName=customerName;
        }
        public String getCustomerName(){
            return customerName;
        }


        public void setEmail(String email){
            this.email=email;
        }
        public String getEmail(){
            return email;
        }

        public void setPhoneNumber(long phoneNumber){
            this.phoneNumber=phoneNumber;
        }
        public long getPhoneNumber(){
            return phoneNumber;
        }

        public void deposit(int depositAmount){
            this.balance +=depositAmount;
            System.out.println("You have successfully deposit "+depositAmount+" in your account");
            System.out.println("Your current balance is: "+balance);
        }


        public void withdraw(int withdrawAmount){
            if(withdrawAmount<=balance && withdrawAmount>0){
                balance-=withdrawAmount;
                System.out.println("You have successfully withdrawn "+withdrawAmount+" from your acc.");
                System.out.println(" your current balance is: "+ balance );

            }
            else {
                System.out.println("You can not withdraw negative amount, OR");
                System.out.println("You don't have "+withdrawAmount+" in your acc.");
                System.out.println("Error!!!!, INSUFFICIENT  BALANCE !!");
            }
        }


}
