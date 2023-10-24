package com.daya.designpatterns.structural.adaptor;

public class EmployeeCsv {

    private final String id;
    private final String firstname;
    private final String lastname;
    private final String email;

    public EmployeeCsv(String empInfo) {
        String[] empDetails = empInfo.split(",");
        id = empDetails[0];
        firstname = empDetails[1];
        lastname = empDetails[2];
        email = empDetails[3];
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
}
