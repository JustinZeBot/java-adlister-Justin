package models;

import java.io.Serializable;

public class Departments implements Serializable {

    private String deptNo;
    private String deptName;


    public Departments() {
    }

    public Departments(String deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public Departments setDeptNo(String deptNo) {
        this.deptNo = deptNo;
        return this;
    }

    public String getDeptName() {
        return deptName;
    }

    public Departments setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
}

