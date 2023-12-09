package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Human> humanList = new ArrayList<>();
    private static ArrayList<Account> accountList = new ArrayList<>();
    public static void printMenu() {
        System.out.println("1. Реєстрація. \n2. Логін. \n3. \n4. \n5.");
    }
    private static void registration() {

    }
    private static void humansInitialize() {
        humanList.add(new Human("Andrew sai", "123454321", new Account()));
    }

}
