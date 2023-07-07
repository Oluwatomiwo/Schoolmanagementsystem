package school;

import school.enums.AcademicRole;
import school.models.AcademicStaff;
import school.models.Course;
import school.services.PrincipalService;
import school.services.TeacherService;
import school.services.impl.PrincipalServiceImpl;
import school.services.impl.TeacherServiceImpl;

public class App {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherServiceImpl(); {

            Course math = new Course("Mathematics");


            AcademicStaff teacher = new AcademicStaff("Paul", "Fred", "08033158936", AcademicRole.TEACHER);

            String result = teacherService.teachCourse(teacher, math);
            System.out.println(result);


            System.out.println("***************************");
        }
        PrincipalService principalService = new PrincipalServiceImpl(); {

            AcademicStaff principal = new AcademicStaff("Pius", "Ibrahim", "08134523432", AcademicRole.PRINCIPAL);
            int strikeTolerance = 3;

            boolean expelled = principalService.expelStudent(principal,strikeTolerance);

            if(expelled) {
                System.out.println("Principal expels Student successfully");
            } else {
                System.out.println("Principal does not expel Student.");
            }


        }

    }

}