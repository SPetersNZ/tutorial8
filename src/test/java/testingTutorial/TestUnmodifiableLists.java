package testingTutorial;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestUnmodifiableLists {
    @Test
    void testLecturerUnmodifiableList() {
        List<String> myList = new ArrayList<>();
        myList.add("Steven");
        myList.add("Peters");

        List<String> readOnlyView = Collections.unmodifiableList(myList);

        assertThrows(UnsupportedOperationException.class, () -> {
            readOnlyView.add("is cool");
        });

        assertTrue(readOnlyView instanceof Iterable);

        int count = 0;
        for (String item : readOnlyView) {
            count++;
        }

        assertEquals(2, count);
    }

}
