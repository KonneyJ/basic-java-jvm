package org.konneyj.module2advanced;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String ownerName, double balance) {
        validateName(ownerName);
        validateBalance(balance);
    }

    public BankAccount(String ownerName) {
        validateName(ownerName);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        validateName(ownerName);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        validateBalance(balance);
    }

    private void validateName(String ownerName) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        } else {
            this.ownerName = ownerName;
        }
    }

    private void validateBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        } else {
            this.balance = balance;
        }
    }
}
