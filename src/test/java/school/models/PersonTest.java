package school.models;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getFirstName() {
        Person person = new Person("Kunle", "Dayo", "08133444555");
        person.getFirstName();
        assertEquals("Kunle", person.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        Person person = new Person("Kunle", "Dayo", "08133444555");
        person.getLastName();
        assertEquals("Dayo", person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getIDNumber() {
        Person person = new Person("Kunle", "Dayo", "08133444555");
        person.getIDNumber();
        assertEquals("08133444555", person.getIDNumber());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        Person person = new Person();
        person.setFirstName("Ike");
        assertEquals("Ike",person.getFirstName());


    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        Person person = new Person();
        person.setLastName("Ade");
        assertEquals("Ade",person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setIDNumber() {
        Person person = new Person();
        person.setIDNumber("09023498767");
        assertEquals("09023498767",person.getIDNumber());
    }

}