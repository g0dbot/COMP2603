/**
 * @Ronel Ramtahal
 */
public class BankApplication
{
    public static void main(String[] args){
        Account a;
        a = new Account();
        a.setNumber(10);
        a.deposit(1000.00);
        System.out.println(a.toString());
    }
}
