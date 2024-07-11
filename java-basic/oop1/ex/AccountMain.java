package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.showBalance();

        account.withdraw(9000);
        account.showBalance();

        account.withdraw(2000);
        account.showBalance();

    }
}
