package school.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void getTitle() {
        Course course = new Course("Mathematics");
        course.getTitle();
        assertEquals("Mathematics",course.getTitle());
    }

    @Test
    void setTitle() {
        Course course = new Course("Mathematics");
        course.setTitle("Mathematics");
        assertEquals("Mathematics",course.getTitle());
    }

}