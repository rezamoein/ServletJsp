package ir.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person {
    private String branch;

    public Student() {

    }

    public Student(int id, String firstName, String lastName, Date birthday, String branch) {
        this.personId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.branch = branch;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public List getAll() {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1, "Ali", "Alizadeh", new Date(), "SF"));
        arrayList.add(new Student(2, "Akbar", "Jamshide", new Date(213542456L), "JF"));
        arrayList.add(new Student(3, "Hossan", "Davoodei", new Date(203564561214L), "AK"));
        arrayList.add(new Student(4, "Golame", "Akbazadeh", new Date(20528656256L), "AK"));
        arrayList.add(new Student(5, "MohammadReza", "Parseh", new Date(99546969999L), "SD"));

        return arrayList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("personId=").append(personId).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthday=").append(birthday).append('\'');
        sb.append(", branch='").append(branch);
        sb.append('}');
        return sb.toString();
    }

}
