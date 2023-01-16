public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
     balance+=amount;
     return balance;
    }

    public int debit(int amount) throws Exception{
        if(amount>balance){
            throw  new Exception("THE Ammount big the your Balance");
        }
        balance-=amount;
        return balance;
    }
    public int transferTo(Account a,int amount) throws Exception{
        if(amount>balance){
            throw  new Exception("THE Ammount big the your Balance");
        }
      int ba=a.getBalance();
      ba+=amount;
      a.setBalance(ba);
      balance-=amount;
      return balance;
    }

    public String toString(){
        return  "Name : "+name+"\n"+"Id : "+id+"\n Balnce : "+balance;
    }
}
