package testingTutorial;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TestMaps {
    @Test
    void testLecturerTestHashMaps() {
        HashMap<Student, String> map = new HashMap<>();
        Student key1 = new Student(1, "Steven", "Peters");
        Student key2 = new Student(1, "Steven", "Peters");

        map.put(key1, "Steven");
        String result = map.get(key2);
        assertEquals("Steven", result);
    }

    @Test
    void testLecturerTestIdentityHashMaps() {
        IdentityHashMap<Student, String> map = new IdentityHashMap<>();
        Student key1 = new Student(1, "Steven", "Peters");
        Student key2 = new Student(1, "Steven", "Peters");

        map.put(key1, "null");
        String result = map.get(key2);
        assertNotNull(result);
    }

}
