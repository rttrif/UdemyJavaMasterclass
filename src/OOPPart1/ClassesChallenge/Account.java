package OOPPart1.ClassesChallenge;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

//    Default constructor
    public Account(){
        this("1234789", 2.5, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = customerEmail;
        customerPhone = customerPhone;
    }

//    Generated constructor
    public Account(String customerPhone, String customerEmail, String customerName) {
        this("999999", 111.11, customerName, customerPhone, customerEmail);
//        this.customerPhone = customerPhone;
//        this.customerEmail = customerEmail;
//        this.customerName = customerName;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;

        System.out.println("Deposited of $" + depositAmount + " made. New balance is $" + this.balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + this.balance + " in your account.");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawn of $" + withdrawAmount + " from your account. Remaining balance is $" + this.balance);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
