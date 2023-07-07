package school.services;

import school.models.AcademicStaff;
import school.models.Applicant;

public interface PrincipalService {
    String AdmitApplicant(AcademicStaff principal, Applicant applicant);


    boolean expelStudent(AcademicStaff Principal, int noOfStrike);

    boolean expelStudent(AcademicStaff Principal, boolean StrikeTolerance);

}
