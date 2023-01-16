public class Main {
    public static void main(String[] args) {

        try{
            Account account=new Account("111","Ahmad",3000);
            Account account1=new Account("1121","Nasser",4000);
            System.out.println(account.toString());
            System.out.println(account.credit(200));
            account.debit(100);
            System.out.println(account.toString());
            account.transferTo(account1,1000);
            System.out.println("Account 1");
            System.out.println(account.toString());
            System.out.println("Account 2");
            System.out.println(account1.toString());

            Employee employee=new Employee("112","Ali",12000);
            System.out.println(employee.getAnnualSalary());
            System.out.println(employee.toString());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}