package models;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private long empNo;
    private String firstName;
    private String lastName;
    private char gender;
    private Date birthDate;
    private Date hireDate;

    public Employee() {
    }

    public Employee(long empNo, String firstName, String lastName, char gender, Date birthDate, Date hireDate) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public long getEmpNo() {
        return empNo;
    }

    public Employee setEmpNo(long empNo) {
        this.empNo = empNo;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public Employee setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Employee setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Employee setHireDate(Date hireDate) {
        this.hireDate = hireDate;
        return this;
    }
}

