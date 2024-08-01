package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.PhoneBook;

import java.util.*;

public class PhoneBookTest {
    private static final PhoneBook phoneBook = new PhoneBook();
    private static final Map<String, String> listContacts = new TreeMap<>();

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
    @CsvSource({"Паша, 9056782309"})
    public void findByNumberTest(String name, String number) {
        PhoneBook phoneBook1 = new PhoneBook();
        String resultName;
        phoneBook1.add(name, number);
        resultName = phoneBook1.findByNumber("905");
        Assertions.assertEquals("Паша\n", resultName);
    }

    @ParameterizedTest
    @CsvSource({"Анна, 9030984681"})
    public void findByName(String name, String number) {
        PhoneBook phoneBook1 = new PhoneBook();
        String resultNumber;
        phoneBook1.add(name, number);
        resultNumber = phoneBook1.findByName(number);
        Assertions.assertEquals("9030984681", resultNumber);
    }


    }
