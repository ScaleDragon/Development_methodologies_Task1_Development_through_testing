package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.PhoneBook;

import java.util.*;

public class PhoneBookTest {
    private static PhoneBook phoneBook = new PhoneBook();
    private static Map<String, String> listContacts = new TreeMap<>();

    @ParameterizedTest
    @CsvSource({"Маша, 1", "Паша, 2", "Анна, 3", "Маша, 6"})
    public void add(String name, String number) {
        listContacts.put(name, number);
        int expected = listContacts.size();
        int result;
        result = phoneBook.add(name, number);
        Assertions.assertEquals(expected, result);
    }
}
