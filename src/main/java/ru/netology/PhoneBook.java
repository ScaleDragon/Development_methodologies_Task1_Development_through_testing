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
        }
        else {
            System.out.println("Такое имя уже есть в списке контактов");
        }
        return countContacts;
    }

    public String findByNumber(String number) {
        String name = "";
        String subString = number.substring(0);
        for (Map.Entry<String, String> entry: listContacts.entrySet()){
            if (entry.getValue().contains(subString)){
                name+= entry.getKey()+"\n";
            }
        }
        return name;
    }

    public String findByName(String number){

        return null;
    }

}
