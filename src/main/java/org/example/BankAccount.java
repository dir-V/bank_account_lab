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

    public int deposit(int amount){
        return this.balance + amount;
    }

    public int withdrawal(int amount){
        return this.balance - amount;
    }
// Generous Bank
    public int interest(){
        return (this.balance * o.25) + this.balance;
    }


}
