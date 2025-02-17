package com.ig.model;
import com.ig.exception.InvalidAmountException;
import com.ig.exception.LowBalanceException;

public class Account {
    public enum AccountType {
        Savings, Current
    }
    
    private Integer accNumber;
    private String custName;
    private AccountType type;
    private Float balance;

  
    public Account(Integer accNumber, String custName, AccountType type, Float balance) throws LowBalanceException, InvalidAmountException {
        super();
        this.accNumber = accNumber;
        this.custName = custName;
        this.type = type;
        
        if (balance < 0) {
            throw new InvalidAmountException("Balance cannot be negative");
        }
        
        if (type == AccountType.Savings && balance < 1000) {
            throw new LowBalanceException("Balance is too low for a savings account");
        } 
      
        else if (type == AccountType.Current && balance < 5000) {
            throw new LowBalanceException("Balance is too low for a current account");
        }
        
        this.balance = balance;
    }

   
    public Integer getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accNumber=" + accNumber + ", custName=" + custName + ", type=" + type + ", balance=" + balance + "]";
    }
}
