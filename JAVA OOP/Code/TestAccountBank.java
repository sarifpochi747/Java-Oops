class AccoutBank{
    int account_no;
    String name;
    float amount;


    
    // Method insertData
    void insertData(int acc_no,String n,float amo){
        account_no = acc_no;
        name = n;
        amount = amo;
    }
    void deposit(float money){
        amount+= money;
    }
    void withdraw(float money){
        if(money <= amount){
            amount -= money;
        }else{
            System.out.println("Not Enough Money");
        }
        
    }
    void displayData(){
        System.out.println(account_no+"\t"+name+"\t"+amount);
    }
}
//main class
public class TestAccountBank {
    public static void main(String[] args) {
        AccoutBank obj1 = new AccoutBank();
        obj1.insertData(1, "sarif pochi", 5000);
        obj1.withdraw(6000);
        obj1.displayData();
    }
}
