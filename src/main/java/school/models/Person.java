package school.models;

import java.util.Objects;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String IDNumber;


    public Person(String firstName, String lastName, String IDNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIDNumber() {
        return IDNumber;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(IDNumber, person.IDNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, IDNumber);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + IDNumber + '\'' +
                '}';
    }
}
