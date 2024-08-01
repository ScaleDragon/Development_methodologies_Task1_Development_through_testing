package ru.netology;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private int countContacts = 0;
    private Map<String, String> listContacts = new TreeMap<>();

    public PhoneBook() {
    }

    public int add(String name, String number) {
        if (!listContacts.containsKey(name)) {
            listContacts.put(name, number);
            countContacts++;
        } else {
            System.out.println("Такое имя уже есть в списке контактов");
        }
        return countContacts;
    }

    public String findByNumber(String number) {
        return null;
    }

//    public static void main(String[] args) {
//        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.add("Маша", "9034568723");
//        phoneBook.add("Bfgf", "9056782309");
//        phoneBook.add("wEsd", "9030984681");
//        phoneBook.add("Мша", "9050927823");
//        System.out.println(phoneBook.countContacts);
//    }

}
