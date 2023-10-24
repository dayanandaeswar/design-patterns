package com.daya.designpatterns.structural.adaptor;

public class EmployeeLdapAdaptor implements Employee{

    private EmployeeLdap employeeLdap;

    public EmployeeLdapAdaptor(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }


    @Override
    public String getEmpId() {
        return this.employeeLdap.getCb();
    }

    @Override
    public String getFirstName() {
        return this.employeeLdap.getName();
    }

    @Override
    public String getLastName() {
        return this.employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return this.employeeLdap.getEmail();
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
