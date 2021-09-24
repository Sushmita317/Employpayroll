package com.bridgelab;

public class EmployeePayrollMain {

    public static void main(String[] args) {
        EmployeePayrollImpl employeePayroll = new EmployeePayrollImpl();
        employeePayroll.readData();
        employeePayroll.writeData();
    }
}


