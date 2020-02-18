package exercise1;

public class Question11 {
        String BankName="DBS Bank";
        String Branch="Singapore";
        String AccountType="Saving";
        int rateofInterest=9;
         void getdetails(){
                System.out.println("BankName : "+BankName);
                System.out.println("Branch : " + Branch);
                System.out.println("AccountType : "+AccountType);
                System.out.println("rateofInterest : "+rateofInterest+"%" );
            }

 class SBI {
     String BankName="SBI Bank";
     String Branch="Delhi";
     String AccountType="Current";
     int rateofInterest=7;
         void getdetails(){
             System.out.println("BankName : "+BankName);
             System.out.println("Branch : " + Branch);
             System.out.println("AccountType : "+AccountType);
             System.out.println("rateofInterest : "+rateofInterest+"%" );
         }
    }
    class BOI {
        String BankName="BOI Bank";
        String Branch="Mumbai";
        String AccountType="Fixed Deposit";
        int rateofInterest=12;
        public void getdetails(){
            System.out.println("BankName : "+BankName);
            System.out.println("Branch : " + Branch);
            System.out.println("AccountType : "+AccountType);
            System.out.println("rateofInterest : "+rateofInterest+"%" );
        }

    }class ICICI {
        String BankName="ICICI Bank";
        String Branch="Noida";
        String AccountType="Recurring DEposit";
        int rateofInterest=10;
        public void getdetails(){
            System.out.println("BankName : "+BankName);
            System.out.println("Branch : " + Branch);
            System.out.println("AccountType : "+AccountType);
            System.out.println("rateofInterest : "+rateofInterest+"%" );
        }

    }

    public static void main(String[] args) {
        Question11 q=new Question11();
        q.getdetails();
        Question11.SBI s=q.new SBI();
        s.getdetails();
        Question11.BOI o=q.new BOI();
        o.getdetails();
        Question11.ICICI i=q.new ICICI();
        i.getdetails();
    }
}
