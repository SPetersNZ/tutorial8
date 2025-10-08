package testingTutorial;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class TestEqualsAndHashcode {
    @Test
    void testLecturerEqualsHashCodeContract() {
        // two Lecturer objects that are equal but will have different hash codes due to different names
        Lecturer lec1 = new Lecturer(123, "Steven", "Steven Peters");
        Lecturer lec2 = new Lecturer(123, "Steven", "Steven John");

        assertEquals(lec1, lec2);
        assertEquals(lec1.hashCode(), lec2.hashCode());
    }
    @Test
    void testStudentEqualsHashCodeContract() {
        // two Lecturer objects that are equal but will have different hash codes due to different names
        Student student1 = new Student(123, "Steven", "Steven Peters");
        Student student2 = new Student(123, "Steven", "Steven Peters");

        assertEquals(student1, student2);
        assertEquals(student1.hashCode(), student2.hashCode());
    }

}