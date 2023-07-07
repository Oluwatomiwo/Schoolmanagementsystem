package school.models;

import org.junit.jupiter.api.Test;
import school.enums.StudentClass;

import static junit.framework.TestCase.assertEquals;

class StudentTest {

    @Test
    void getStudentClass() {
        Student student = new Student("Isaiah", "McCarthy","09044124398", StudentClass.SS1,  13,0 );;
        student.getStudentClass();
        assertEquals(StudentClass.SS1, student.getStudentClass());

    }

    @Test
    void setStudentClass() {
        Student student = new Student("Gabriel", "Shola", "08033314145", StudentClass.SS2, 16, 1);
        student.setStudentClass(StudentClass.SS2);
        assertEquals(StudentClass.SS2, student.getStudentClass());
    }

}