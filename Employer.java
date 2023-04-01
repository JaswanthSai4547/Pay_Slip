package com.payslip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employer
{
    private String name_of_company = "Sasken Technologies";
    private Map<String,Integer> locations = new HashMap<>();
    private Map<String,Integer> bands = new HashMap<>();
    private Map<String,Integer> departments = new HashMap<>();
    private Map<Integer,Employee> employe_dict = new HashMap<>();

    public Employer(String name_of_company, String location,Integer count1,String band,Integer count2, String department,Integer count3, Integer empId,Employee employe_obj) {
        this.name_of_company = name_of_company;
        this.locations.put(location,count1);
        this.bands.put(band,count2);
        this.departments.put(department,count3);
        this.employe_dict.put(empId,employe_obj);
    }

public Employer()
{}

    public void setEmploye_dict( int empid,Employee empobj) {
        this.employe_dict.put(empid,empobj);
    }

    public String getName_of_company() {
        return name_of_company;
    }

    public void setName_of_company(String name_of_company) {
        this.name_of_company = name_of_company;
    }

    public Map<String, Integer> getLocations() {
        return locations;
    }

    public void setLocations(String location, Integer count) {
        this.locations.put(location,count);
    }

    public Map<String,Integer> getBands() {
        return bands;
    }

    public void setBands(String band,Integer count2) {
        this.bands.put(band, count2);
    }

    public Map<String,Integer> getDepartments() {
        return departments;
    }

    public void setDepartments(String department,Integer count3) {
        this.departments.put(department, count3);
    }

    public Map<Integer, Employee> getEmploye_dict() {
        return employe_dict;
    }

    public void setEmploye_dict(Integer empId,Employee employe_obj) {
        this.employe_dict.put(empId,employe_obj);

    }


    @Override
    public String toString() {
        return "Employer{" +
                "name_of_company='" + name_of_company + '\'' +
                ", locations=" + locations +
                ", bands=" + bands +
                ", departments=" + departments +"\n"+
                ", employe_dict=" + employe_dict +"\n"+
                '}';
    }
}
