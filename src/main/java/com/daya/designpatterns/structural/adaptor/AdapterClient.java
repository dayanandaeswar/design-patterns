package com.daya.designpatterns.structural.adaptor;

import java.util.List;

public class AdapterClient {

    public static void main(String[] args) {

        AdptorDp adptorDp = new AdptorDp();
        List<Employee> employeeDetails = adptorDp.getEmployeeDetails();
        for (Employee employeeDetail : employeeDetails) {
            System.out.println(employeeDetail);
        }

    }
}
