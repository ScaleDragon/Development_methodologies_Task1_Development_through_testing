package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.PhoneBook;

import java.util.HashSet;
import java.util.Set;

public class PhoneBookTest {
    private Set<String> contactList = new HashSet<>();

    @ParameterizedTest
    @CsvSource({"Маша, 9034568723" ," Паша, 9052431478 "," Анна,9088764572","Маша,9035673957"})
    public void add(String name, int number) {
        final int countContact = 3;
        PhoneBook phoneBook = new PhoneBook();
       int result = phoneBook.add(name,number);
    Assertions.assertEquals(countContact, result);
    }

}
