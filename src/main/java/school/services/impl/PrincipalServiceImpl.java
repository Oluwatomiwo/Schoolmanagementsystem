package school.services.impl;

import school.enums.StudentClass;
import school.models.AcademicStaff;
import school.models.Applicant;
import school.models.Student;
import school.services.PrincipalService;

import java.util.Objects;

public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public String AdmitApplicant(AcademicStaff principal, Applicant applicant) {
        if (Objects.isNull(principal)) {
            throw new RuntimeException("Principal cannot be null");
        }
        return principal.getFirstName() + " admitted applicant successfully.";
    }

    @Override
    public boolean expelStudent(AcademicStaff Principal, int noOfStrike) {
        return false;
    }

    @Override
    public boolean expelStudent(AcademicStaff Principal, boolean StrikeTolerance) {
        Student student= new Student("David", "Mark", "09045623189",StudentClass.SS1, 13,2);
        if (student.getNoOfStrikes() < 3) {
            throw new RuntimeException("Not Expelled");
        }
        return StrikeTolerance;
    }

}