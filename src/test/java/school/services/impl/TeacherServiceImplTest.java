package school.services.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.enums.AcademicRole;
import school.models.AcademicStaff;
import school.models.Course;
import school.services.TeacherService;

class TeacherServiceImplTest {

    @Test
    void teachCourse() {
        AcademicStaff teacher = new AcademicStaff("Paul", "Fred", "08033158936", AcademicRole.TEACHER);
        Course course = new Course("Mathematics");
        TeacherService teacherService = new TeacherServiceImpl();

        String result = teacherService.teachCourse(teacher, course);


        String expected = "Teacher Paul teaches Mathematics successfully.";
        Assertions.assertEquals(expected, result);

    }
}