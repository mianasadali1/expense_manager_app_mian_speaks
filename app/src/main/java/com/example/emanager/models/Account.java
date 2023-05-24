package com.example.emanager.models;

public class Account {
    private double accountAmount;
    private String accountName;

    public Account() {
    }

    public Account(double accountAmount, String accountName) {
        this.accountAmount = accountAmount;
        this.accountName = accountName;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
