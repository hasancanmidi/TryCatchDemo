package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        AccountManager accountManager = new AccountManager();

        System.out.println("Account = " + accountManager.getBalance());

        accountManager.deposit(100);
        System.out.println("Account = " + accountManager.getBalance());

        try {
            accountManager.withdraw(90);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Account = " + accountManager.getBalance());

        try {
            accountManager.withdraw(20);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Account = " + accountManager.getBalance());
    }
}
