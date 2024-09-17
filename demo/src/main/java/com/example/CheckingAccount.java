package com.example;

public class CheckingAccount {
    private int balance;
    private String name;
    
    public CheckingAccount (String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int deposit(int deposit){
        setBalance(getBalance() + deposit);
        return getBalance();
    }

    public int withdraw  (int amountToWithdraw ){
        if (amountToWithdraw > getBalance()){
            throw new IllegalArgumentException("Cannot withdraw!");
       
        } 
        else{
            setBalance(getBalance() - amountToWithdraw );

            return getBalance();
        }
        
    }
    
}