package com.daya.designpatterns.structural.adaptor;

public class EmployeeLdap {

    private final String cb;
    private final String surname;
    private final String name;
    private final String email;

    public EmployeeLdap(String cb, String surname, String name, String email){
        this.cb = cb;
        this.surname = surname;
        this.name = name;
        this.email = email;
    }

    public String getCb() {
        return cb;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
