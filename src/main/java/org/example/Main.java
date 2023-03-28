package org.example;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Vincent", "Adeola", "31/07/2001", 9103910);
        bankAccount.setFirstName("Bill");
        System.out.println(bankAccount.getFirstName());
    }
}

