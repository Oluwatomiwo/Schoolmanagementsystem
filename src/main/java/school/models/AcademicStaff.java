package school.models;

import school.enums.AcademicRole;

import java.util.Objects;

public class AcademicStaff extends Person{
    private AcademicRole role;


    public AcademicStaff(String firstName, String lastName, String phoneNumber,AcademicRole role) {
        super(firstName, lastName, phoneNumber);
        this.role = role;
    }



    public String getStaffName() {
        return String.format("%s firstName");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AcademicStaff that = (AcademicStaff) o;
        return role == that.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), role);
    }

    public AcademicRole getRole() {
        return role;
    }

    public void setRole(AcademicRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "AcademicStaff{" +
                "role=" + role +
                '}';
    }

}
