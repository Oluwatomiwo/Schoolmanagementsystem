package school.models;

import org.junit.jupiter.api.Test;
import school.enums.AcademicRole;

import static org.junit.jupiter.api.Assertions.*;

class AcademicStaffTest {

    @Test
    void getRole() {
        AcademicStaff academicStaff = new AcademicStaff("Kunle", "Shina","08097634556", AcademicRole.TEACHER);
        academicStaff.getRole();
        assertEquals(AcademicRole.TEACHER, academicStaff.getRole());
    }

    @Test
    void setRole() {
        AcademicStaff academicStaff = new AcademicStaff("Kunle", "Shina","08097634556", AcademicRole.TEACHER);
        academicStaff.setRole(AcademicRole.TEACHER);

    }
}