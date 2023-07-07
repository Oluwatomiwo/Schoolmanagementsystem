package school.models;

import school.enums.StudentClass;

import java.util.Objects;

public class Student extends Person{

    private int noOfStrikes;
    private int age;

    public StudentClass studentClass;

   public Student(String firstName, String lastName, String IDNumber, StudentClass studentClass, int age, int noOfStrikes) {
        super(firstName, lastName, IDNumber);
        this.studentClass = studentClass;
        this.age = age;
        this.noOfStrikes = noOfStrikes;
    }


    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public int getAge() {return age;}

    public void SetAge(int age) { this.age = age;}

    public int getNoOfStrikes() {return noOfStrikes;}

    protected void setNoOfStrikes(int noOfStrikes) { this.noOfStrikes = noOfStrikes; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentClass == student.studentClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentClass);
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentClass=" + studentClass +
                '}';
    }
}
