package Classes;

import java.util.ArrayList;
import java.util.List;

public class BankService {
    private final List<Account.BankCard> bankCards;
    private final List<Product> productList;

    public BankService() {
        bankCards = new ArrayList<>();
        this.productList = new ArrayList<>();
        productList.add(new Product("Батончик", 100));
        productList.add(new Product("Машина", 200));
        productList.add(new Product("Скло", 150));
        productList.add(new Product("Макбук", 300));
        productList.add(new Product("Кіт", 50));
    }

    public Account.BankCard getBankCardByNumber(String cardNumber) {
        return bankCards.stream()
            .filter(bankCard -> bankCard.getCardNumber().equals(cardNumber)).findFirst()
            .orElse(null);
    }

    public List<Product> getProductList() {
        return productList;
    }
}