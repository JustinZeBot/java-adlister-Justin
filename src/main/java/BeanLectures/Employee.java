package BeanLectures;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private long empNo;
    private String firstName;
    private String lastName;
    private char gender;
    private Date birthDate;
    private Date hireDate;

    public Employee() {  }

// start getters
    public long getEmpNo(){
        return empNo;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public char getGender(){
        return gender;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public Date getHireDate() {
        return hireDate;
    }
    // start setters

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
