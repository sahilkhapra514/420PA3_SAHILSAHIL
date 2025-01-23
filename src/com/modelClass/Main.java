package com.modelClass;
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345678", 100);


        account.deposit(50);


        account.withdraw(30);


        account.getBalance();
    }
}


