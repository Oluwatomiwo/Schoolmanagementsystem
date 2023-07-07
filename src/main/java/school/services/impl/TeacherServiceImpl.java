package school.services.impl;

import school.enums.AcademicRole;
import school.models.AcademicStaff;
import school.models.Course;
import school.services.TeacherService;

import java.util.Objects;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public String teachCourse(AcademicStaff teacher, Course course) {

        if (Objects.isNull(teacher)) {
            throw new RuntimeException("Teacher can not be null");
        }



        if (!AcademicRole.TEACHER.equals(teacher.getRole())) {
            throw new RuntimeException("You are not a Teacher, Therefore you cannot teach course");
        }

        return "Teacher " + teacher.getFirstName() + " teaches "  + course.getTitle() + " successfully.";

    }
}

