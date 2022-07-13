package models;

import java.io.Serializable;
import java.util.Date;

public class Salaries implements Serializable {
    private long empNo;
    private Date fromDate;
    private Date toDate;
    private double salary;

    public Salaries() {
    }

    public Salaries(long empNo, Date fromDate, Date toDate, double salary) {
        this.empNo = empNo;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.salary = salary;
    }

    public long getEmpNo() {
        return empNo;
    }

    public Salaries setEmpNo(long empNo) {
        this.empNo = empNo;
        return this;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Salaries setFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public Date getToDate() {
        return toDate;
    }

    public Salaries setToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Salaries setSalary(double salary) {
        this.salary = salary;
        return this;
    }
}
