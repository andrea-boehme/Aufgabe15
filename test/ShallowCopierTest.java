import org.junit.jupiter.api.Test;

import java.awt.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


public class ShallowCopierTest {
    @Test
    public void ShallowCopierTest() {
        Person objectToCopy = new Person(18, "Anna", "Klein", 150, 50);

        ShallowCopier<Person> objectCopier = new ShallowCopier<>();
        List<Person> copies = objectCopier.genericCreateShallowCopy(objectToCopy, 5);

        Integer expectedAge = 18;
        Integer ageOfFirstCopy = copies.get(0).age;
        assertEquals(expectedAge, ageOfFirstCopy);

        int expectedCopiesSize = 5;
        int copiesSize = copies.size();
        assertEquals(expectedCopiesSize, copiesSize);

        for (Person copy : copies) {
            assertSame(copy, objectToCopy);
        }
        /*
        for(int copy = 0; copy < copies.length; copy++) {
            copies[copy] = copies.get(copy);
        }
         */
    }

}