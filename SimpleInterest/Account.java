package SimpleInterest;

public class Account {
    {
        private String accountType;
        private long accountNumber;
        private long minimumBalance;
        Account(String accountType,long accountNumber,long minimumBalance)
        {
            this.accountType=accountType;
            this.accountNumber=accountNumber;
            this.minimumBalance=minimumBalance;
           
        }
        void disp()
        {
            System.out.println("AccountType :"+AccountType+" "+"\n AccountNumber:"+AccountNumber+" "+"minimumBalance :"+minimumBalance);
        }
    
        }
    
        public void simpleInterest(){
            double principal=10000;
            float rateOfInterest=7;
            int time=2;
            double simpleInterest=(principal*rateOfInterest*time)/100;
            System.out.println("Simple Interest:"+simpleInterest);
    
}
