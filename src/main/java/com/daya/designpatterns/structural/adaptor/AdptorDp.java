package com.daya.designpatterns.structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class AdptorDp {

    public List<Employee> getEmployeeDetails() {
        List<Employee> employees = new ArrayList();

        Employee employeeDb = new EmployeeDb("e5617696", "Dayananda", "Eswaraiah", "e.dayananda@gmail.com");
        EmployeeLdap employeeLdap = new EmployeeLdap("e5617696", "Dayananda", "Eswaraiah", "e.dayananda@gmail.com");
        EmployeeCsv employeeCsv = new EmployeeCsv("e5617696,Dayananda,Eswaraiah,e.dayananda@gmail.com");

        employees.add(employeeDb);
        employees.add(new EmployeeLdapAdaptor(employeeLdap));
        employees.add(new EmployeeCsvAdaptor(employeeCsv));

        return employees;
    }
}
