package com.payslip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employee
{
    private String name;
    private String gender;
    private Address addressobj = new Address();
    private String location;
    private int emp_id;
    private String department;
    private String emp_type;
    private String band;
    private long pf_number;
    private long ac_number;
    private Double ctc;
    private static SalarySlip salarySlip_obj = new SalarySlip();
    private Map<String,SalarySlip> salary_slip = new HashMap<>();
    private static ArrayList<Employee> emp_obj = new ArrayList<>();

    public Employee(){}
    public Employee(String name, String gender, Address addressobj, String location, int emp_id, String department, String emp_type, String band, long pf_number, long ac_number, double ctc) {
        this.name = name;
        this.gender = gender;
        this.addressobj = addressobj;
        this.location = location;
        this.emp_id = emp_id;
        this.department = department;
        this.emp_type = emp_type;
        this.band = band;
        this.pf_number = pf_number;
        this.ac_number = ac_number;
        this.ctc = ctc;
    }

    public SalarySlip getSalarySlip_obj() {
        return salarySlip_obj;
    }

//    public void setSalarySlip_obj(SalarySlip salarySlip_obj) {
//        this.salarySlip_obj = salarySlip_obj;
//    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getGender() {
//        return gender;
//    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddressobj() {
        return addressobj;
    }

//    public void setAddressobj(Address addressobj) {
//        this.addressobj = addressobj;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    public String getEmp_type() {
//        return emp_type;
//    }

    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

//    public long getPf_number() {
//        return pf_number;
//    }

    public void setPf_number(long pf_number) {
        this.pf_number = pf_number;
    }

//    public long getAc_number() {
//        return ac_number;
//    }

    public void setAc_number(long ac_number) {
        this.ac_number = ac_number;
    }

    public double getCtc() {
        return ctc;
    }

    public void setCtc(double ctc) {
        this.ctc = ctc;
    }

    public Map<String, SalarySlip> getSalary_slip() {
        return salary_slip;
    }

    public void setSalary_slip( String date,SalarySlip ssobj) {
        this.salary_slip.put(date, ssobj);
    }

    public static ArrayList<Employee> getEmp_obj() {
        return emp_obj;
    }

//    public static void setEmp_obj(ArrayList<Employee> emp_obj) {
//        Employee.emp_obj = emp_obj;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", addressobj=" + addressobj +
                ", location='" + location + '\'' +
                ", emp_id=" + emp_id +
                ", department='" + department + '\'' +
                ", emp_type='" + emp_type + '\'' +
                ", band='" + band + '\'' +
                ", pf_number=" + pf_number +
                ", ac_number=" + ac_number +
                ", ctc=" + ctc +"\n"+
                '}';
    }
}