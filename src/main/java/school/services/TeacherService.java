package school.services;

import school.models.AcademicStaff;
import school.models.Course;

public interface TeacherService {
    String teachCourse(AcademicStaff teacher,Course course);

}
