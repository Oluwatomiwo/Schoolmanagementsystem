package school.models;

import java.util.Objects;

public class Applicant extends Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Applicant(String firstName, String lastName, String IDNumber, int age) {
        super(firstName, lastName, IDNumber);
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Applicant applicant = (Applicant) o;
        return age == applicant.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "age=" + age +
                '}';
    }
}
