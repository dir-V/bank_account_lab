package org.example;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;

    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }
//    Getters and Setters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }


// Deposit, Withdrawal and Interest Methods
    public int deposit(int amount){
        return this.balance + amount;
    }

    public int withdrawal(int amount){
        return this.balance - amount;
    }
// Generous Bank
    public int interest(double interestRate){
        return (int) (this.balance * interestRate) + (this.balance);
    }


}
