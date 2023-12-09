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
        productList.add(new Product("Машина", 2000));
        productList.add(new Product("Скло", 10));
        productList.add(new Product("Макбук", 1000));
        productList.add(new Product("Кіт", 50));

    }

    public Account.BankCard getCard(String cardNumber) {
        return bankCards.stream()
            .filter(bankCard -> bankCard.getCardNumber().equals(cardNumber)).findFirst()
            .orElse(null);
    }


    public List<Product> getProductList() {
        return productList;
    }
}