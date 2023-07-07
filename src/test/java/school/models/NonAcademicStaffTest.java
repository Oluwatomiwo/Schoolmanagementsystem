package school.models;

import org.junit.jupiter.api.Test;
import school.enums.NonAcademicRole;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonAcademicStaffTest {

    @Test
    void getRole() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff("Ibrahim", "Ope", "12432343231", NonAcademicRole.SECRETARY);
        nonAcademicStaff.getRole();
        assertEquals(NonAcademicRole.SECRETARY, nonAcademicStaff.getRole());

    }

    @Test
    void setRole() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
        nonAcademicStaff.setRole(NonAcademicRole.ADMINISTRATOR);
        assertEquals(NonAcademicRole.ADMINISTRATOR,nonAcademicStaff.getRole());
    }

}