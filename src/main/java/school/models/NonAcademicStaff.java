package school.models;

import school.enums.NonAcademicRole;

import java.util.Objects;

public class NonAcademicStaff extends Person{
    private NonAcademicRole role;


    public NonAcademicStaff(String firstName, String lastName, String IDNumber, NonAcademicRole role) {
        super(firstName, lastName, IDNumber);
        this.firstName=firstName;
        this.lastName=lastName;
        this.IDNumber=IDNumber;
        this.role = role;
    }

    public NonAcademicStaff() {

    }

    public NonAcademicRole getRole() {
        return role;
    }

    public void setRole(NonAcademicRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NonAcademicStaff that = (NonAcademicStaff) o;
        return role == that.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), role);
    }

    @Override
    public String toString() {
        return "NonAcademicStaff{" +
                "role=" + role +
                '}';
    }
}
