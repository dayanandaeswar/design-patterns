package com.daya.designpatterns.structural.adaptor;

public class EmployeeDb implements Employee{

    private final String empId;
    private final String firstName;
    private final String lastName;
    private final String email;

    public EmployeeDb(String empId, String firstName, String lastName, String email) {
        super();
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getEmpId() {
        return empId;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmployeeDb{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
