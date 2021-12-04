package com.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayRollService() {
    }

    public EmployeePayRollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }


    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID:");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name:");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee salary");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    private void writeEmployeePayrollData() {
        System.out.println("\n Writing Employee Payroll Roaster to console\n" + employeePayrollList);
    }
}
