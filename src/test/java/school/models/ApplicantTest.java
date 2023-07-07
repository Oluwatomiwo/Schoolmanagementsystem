package school.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    @Test
    void getAge() {
        Applicant applicant = new Applicant("Victor", "Grace","08120984565", 14);
        applicant.getAge();
        assertEquals(14, applicant.getAge());
    }

    @Test
    void setAge() {
        Applicant applicant = new Applicant("Gibia", "Assad", "09033314567", 15);
        applicant.setAge(15);
        assertEquals(15,applicant.getAge());
    }

}