package Classes;

import java.util.ArrayList;
import java.util.Random;
import Exception.InsufficientFundsException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Account {
    private int balance;

    public double getBalance() {
        return balance;
    }

    public Human getAccountOwner() {
        return accountOwner;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    private Human accountOwner;
    private BankCard bankCard;
    public Account() {
        this.balance = 0;
    }
    public Account(Human accountOwner, BankCard bankCard, int balance) {
        this.balance = balance;
        this.accountOwner = accountOwner;
        this.bankCard = bankCard;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            throw new InsufficientFundsException("Недостатньо коштів.");
        }
    }
    public class BankCard {
        private final Account account;
        private final String cardNumber;
        public Account getAccount() {
            return account;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public BankCard(Account account) {
            this.account = account;
            this.cardNumber = generateCardNumber();
        }

        private String generateCardNumber() {
            return IntStream.range(0, 15).map(i -> new Random().nextInt(10))
                .mapToObj(String::valueOf).collect(Collectors.joining());
        }
    }

}
