package com.bl.stockmngmt;

public class Account {

    int balance = 100;

    public void debit(int debit_amount) {
        if(this.balance > debit_amount) {
                balance = balance - debit_amount;
            System.out.println("Updated Balance: " +balance);
        }
        else {
            System.out.println("Debit Amount Exceeded Account Balance ");
        }
    }

}
