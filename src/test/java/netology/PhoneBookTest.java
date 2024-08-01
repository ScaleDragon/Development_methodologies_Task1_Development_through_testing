package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.PhoneBook;

import java.util.*;

public class PhoneBookTest {
    private static PhoneBook phoneBook = new PhoneBook();
    private static Map<String, String> listContacts = new TreeMap<>();

    @ParameterizedTest
    @CsvSource({"Маша, 9034568723", "Паша, 9056782309", "Анна, 9030984681", "Маша, 9050927823"})
    public void add(String name, String number) {
        listContacts.put(name, number);
        int expected = listContacts.size();
        int result;
        result = phoneBook.add(name, number);
        Assertions.assertEquals(expected, result);
    }


    @ParameterizedTest
    @CsvSource({"905678, Паша", "90345, Маша"})
    public void findByNumberTest(String number, String name) {
        String resultName = "";
        resultName = phoneBook.findByNumber(number);
        Assertions.assertEquals(name, resultName);
    }


}
