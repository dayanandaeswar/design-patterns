package com.daya.designpatterns.structural.adaptor;

public class EmployeeCsvAdaptor implements Employee{

    private EmployeeCsv employeeCsv;

    public EmployeeCsvAdaptor(EmployeeCsv employeeDb){
        this.employeeCsv = employeeDb;
    }


    @Override
    public String getEmpId() {
        return this.employeeCsv.getId();
    }

    @Override
    public String getFirstName() {
        return this.employeeCsv.getFirstname();
    }

    @Override
    public String getLastName() {
        return this.employeeCsv.getLastname();
    }

    @Override
    public String getEmail() {
        return this.employeeCsv.getEmail();
    }

    @Override
    public String toString() {
        return "EmployeeDb{" +
                "empId='" + this.getEmpId() + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                '}';
    }
}
