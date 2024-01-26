/**
 * @Ronel Ramtahal
 */
public class Account
{
    //declare attributes
    private int number;
    private double balance;
    
    //declare and define methods
    
    public int getNumber(){
        return number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String toString(){
        String s;
        s = "Number: " + number + " Balance: " + balance;
        return s;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
    
    public void withdraw(double amount){
        if (balance >= amount)
            balance = balance - amount;
    }
}
