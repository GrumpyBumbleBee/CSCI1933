import java.util.Scanner;
public class BankAccount {
  private String name;
  private String password;
  private double balance;

  public void withdraw(String enteredPassword, double amount) {
  if (password.equals(enteredPassword) && balance >= amount) {
    balance = balance - amount;
    }
  }
  public void deposit(String enteredPassword, double amount) {
    if (password.equals(enteredPassword)) {
      balance = balance + amount;
    }
  }
  public double getBalance(String enteredPassword) {
    if (password.equals(enteredPassword)){
    return balance;
    } else {
      return -1;
    }
  }
  public boolean setPassword(String oldPassword, String newPassword) {
    if (password.equals(oldPassword)){
      password = newPassword;
      return true;
    } else {
      return false;
    }
  }
  public void setName(String newName) {
    this.name = newName;
  }
  public String getName() {
    return name;
  }

  public BankAccount (String initName, String initPass, double initBalance){
    this.name = initName;
    this.password = initPass;
    this.balance = initBalance;
  }
  public void transfer(BankAccount other, String enteredPassword, double amount){
    if (password.equals(enteredPassword)){
      withdraw(enteredPassword,amount);
      System.out.println("Type your password: ");
      Scanner myScanner = new Scanner(System.in);
      String input = myScanner.nextLine();
      if(other.password.equals(input)){
        other.deposit(input,amount);
        System.out.println("Other account's balance is "+other.getBalance(input));
      } else {
        deposit(enteredPassword,amount);
        System.out.println("Wrong password");
      }
    }
  }

  public static void main(String[] args){
    BankAccount myAccount = new BankAccount("Java", "CSCI1933 rules!", 100.50);
    myAccount.password = "CSCI1933 rules!";
    myAccount.deposit("CSCI1933 rules!", 100.50);
    //System.out.println("My account's balance is: " +myAccount.balance);
    //System.out.println("Type your password: ");
    //Scanner myScanner = new Scanner(System.in);
    //String input = myScanner.nextLine();
    //System.out.println("My account's balance is: " +myAccount.getBalance(input));
    BankAccount myOtherAccount = new BankAccount("Java2", "123",50.0);
    myAccount.transfer(myOtherAccount,"CSCI1933 rules!",30.0);
    System.out.println("This account's balance is "+myAccount.getBalance("CSCI1933 rules!"));
    //System.out.println("Other account's balance is "+myOtherAccount.getBalance());
  }
}
