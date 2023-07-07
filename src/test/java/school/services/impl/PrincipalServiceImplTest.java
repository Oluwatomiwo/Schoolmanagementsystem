package school.services.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.enums.AcademicRole;
import school.models.AcademicStaff;
import school.models.Applicant;
import school.services.PrincipalService;

class PrincipalServiceImplTest {

    @Test
    void admitApplicant() {
        AcademicStaff principal = new AcademicStaff("Fredrick", "Ahmed", "08012345678", AcademicRole.PRINCIPAL);
        Applicant applicant = new Applicant("Jane", "Adeshola", "123ad", 14);
        PrincipalService principalService = new PrincipalServiceImpl();

        String result = principalService.AdmitApplicant(principal, applicant);

        String expected = "Fredrick admitted applicant successfully.";
        Assertions.assertEquals(expected, result);

    }
}
