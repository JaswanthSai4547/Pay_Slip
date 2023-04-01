package com.payslip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Methods m = new Methods();
        Employee.getEmp_obj().add(m.tempobj);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("-----Pay Slip-----");
        while(true)
        {
            System.out.println("1.ADD User");
            System.out.println("2.Modify User");
            System.out.println("3.Remove Employee");
            System.out.println("4.Search Employee");
            System.out.println("5.Print All Employees");
            System.out.println("6.Generate Pay Slip");
            System.out.println("7.Exit");
            System.out.println("enter your choice:");
            int choice = sc2.nextInt();
            switch (choice)
            {
                case 1:
                    m.adduser(new Employee());
                    break;
                case 2:
                    m.modify_user();
                    break;
                case 3:
                    m.remove_emp();
                    break;
                case 4:
                    m.search_employee();
                    break;
                case 5:
                    m.print_all();
                    break;
                case 6:
                    m.pay_slip();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("invalid input");
            }
        }
    }
}