package com.payslip;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Methods
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    Address addobj = new Address("2-31a","7th main","domlur","banglore",560071);  //another way
    Employee tempobj = new Employee("jasu","male",new Address("2-31a","7th main","domlur","banglore",560071),"BANGLORE",213132,"ASE","permanent","E1",1234567,9876543,5);
    Employer employerobj = new Employer("SaSken technologies","BANGLORE",1,"E1",1,"ASE",1,213132,tempobj);
    public void adduser(Employee e)
    {
        //taking all employee details from the user
        try{
            System.out.println("name:");
            e.setName(br.readLine());
            System.out.println("gender:");
            e.setGender(br.readLine());
            System.out.println("enter address :");
            System.out.println("Door No:");
            e.getAddressobj().setDoor_no(br.readLine());
            System.out.println("Street:");
            e.getAddressobj().setStreet(br.readLine());
            System.out.println("area:");
            e.getAddressobj().setArea(br.readLine());
            System.out.println("city:");
            e.getAddressobj().setCity(br.readLine());
            System.out.println("pin:");
            e.getAddressobj().setPin(Integer.parseInt(br.readLine()));
            System.out.println("Location:");
            e.setLocation(br.readLine().toUpperCase());
            System.out.println("employee id :");
            e.setEmp_id(Integer.parseInt(br.readLine()));
            System.out.println("department(Eg:- SEC,SatCom,Devices,RAN):");
            e.setDepartment(br.readLine().toUpperCase());
            System.out.println("employee type(permanent/part-time/contractor):");
            e.setEmp_type(br.readLine());
            System.out.println("band(eg:- GT,E1,E2,E3,L1,L2,L3):");
            e.setBand(br.readLine().toUpperCase());
            System.out.println("PF number:");
            e.setPf_number(Long.parseLong(br.readLine()));
            System.out.println("a/c number:");
            e.setAc_number(Long.parseLong(br.readLine()));
            System.out.println("CTC(in lakhs):");
            e.setCtc(Double.parseDouble(br.readLine()));
            Employee.getEmp_obj().add(e);
        }catch (Exception exe) {
            System.out.println("invalid input\ntry again from the begining");
            return;
        }

        //add location,bands,dep/home/ee213130artment details to the employer list
        if(employerobj.getLocations().containsKey(e.getLocation()))
          employerobj.getLocations().put(e.getLocation(),employerobj.getLocations().get(e.getLocation())+1);
        else
            employerobj.getLocations().put(e.getLocation(),1);
        //band
        if(employerobj.getBands().containsKey(e.getBand()))
            employerobj.getBands().put(e.getBand(),employerobj.getBands().get(e.getBand())+1);
        else
            employerobj.getBands().put(e.getBand(),1);
        //department
        if(employerobj.getDepartments().containsKey(e.getDepartment()))
            employerobj.getDepartments().put(e.getDepartment(),employerobj.getBands().get(e.getDepartment())+1);
        else
            employerobj.getDepartments().put(e.getDepartment(),1);

        //mapping employee as key and employee obj as value to employer hashmap
        employerobj.getEmploye_dict().put(e.getEmp_id(),e);
    }
    public void modify_user()
    {
        try {
            System.out.println("enter employee id:");
            int temp = Integer.parseInt(br.readLine());
            if (Employee.getEmp_obj().size() == 0)
                System.out.println("employee id not found");
            else {
                for (int i = 0; i < Employee.getEmp_obj().size(); i++) {
                    if (temp == Employee.getEmp_obj().get(i).getEmp_id()) {
                        b: while (true) {
                            System.out.println("enter option which you want to modify:");
                            System.out.println("1.Name:");
                            System.out.println("2.address:");
                            System.out.println("3.location:");
                            System.out.println("4.department:");
                            System.out.println("5.employee type:");
                            System.out.println("6.band");
                            System.out.println("7.A/C number:");
                            System.out.println("8.CTC:");
                            System.out.println("9.exit");
                            int choice = Integer.parseInt(br.readLine());
                            switch (choice) {
                                case 1:
                                    System.out.println("enter name:");
                                    Employee.getEmp_obj().get(i).setName(br.readLine());
                                    System.out.println("name updated successfully");
                                    break;
                                case 2:
                                    System.out.println("enter address");
                                    System.out.println("pin:");
                                    Employee.getEmp_obj().get(i).getAddressobj().setPin(Integer.parseInt(br.readLine()));
                                    System.out.println("Door no:");
                                    Employee.getEmp_obj().get(i).getAddressobj().setDoor_no(br.readLine());
                                    System.out.println("street:");
                                    Employee.getEmp_obj().get(i).getAddressobj().setStreet(br.readLine());
                                    System.out.println("Area:");
                                    Employee.getEmp_obj().get(i).getAddressobj().setArea(br.readLine());
                                    System.out.println("city:");
                                    Employee.getEmp_obj().get(i).getAddressobj().setCity(br.readLine());
                                    System.out.println("address updated successfully");
                                    break;
                                case 3:
                                    System.out.println("location:");
                                    String location = br.readLine().toUpperCase();
                                    if (!employerobj.getLocations().containsKey(location)) {
                                        employerobj.getLocations().put(Employee.getEmp_obj().get(i).getLocation(), employerobj.getLocations().get(Employee.getEmp_obj().get(i).getLocation()) - 1);
                                        employerobj.getLocations().put(location, 1);
                                        if (employerobj.getLocations().get(Employee.getEmp_obj().get(i).getLocation()) == 0) {
                                            employerobj.getLocations().remove(Employee.getEmp_obj().get(i).getLocation());
                                        }

                                    } else {
                                        employerobj.getLocations().put(Employee.getEmp_obj().get(i).getLocation(), employerobj.getLocations().get(Employee.getEmp_obj().get(i).getLocation()) - 1);
                                        if (employerobj.getLocations().get(Employee.getEmp_obj().get(i).getLocation()) == 0) {
                                            employerobj.getLocations().remove(Employee.getEmp_obj().get(i).getLocation());
                                        }
                                        employerobj.getLocations().put(location, employerobj.getLocations().get(location) + 1);
                                    }
                                    Employee.getEmp_obj().get(i).setLocation(location);
                                    System.out.println("location updated successfully");
                                    break;
                                case 4:
                                    System.out.println("department:");
                                    String department = br.readLine().toUpperCase();
                                    if (!employerobj.getDepartments().containsKey(department)) {
                                        employerobj.getDepartments().put(Employee.getEmp_obj().get(i).getDepartment(), employerobj.getDepartments().get(Employee.getEmp_obj().get(i).getDepartment()) - 1);
                                        employerobj.getDepartments().put(department, 1);
                                        if (employerobj.getDepartments().get(Employee.getEmp_obj().get(i).getDepartment()) == 0) {
                                            employerobj.getDepartments().remove(Employee.getEmp_obj().get(i).getDepartment());
                                        }

                                    } else {
                                        employerobj.getDepartments().put(Employee.getEmp_obj().get(i).getDepartment(), employerobj.getDepartments().get(Employee.getEmp_obj().get(i).getDepartment()) - 1);
                                        if (employerobj.getDepartments().get(Employee.getEmp_obj().get(i).getDepartment()) == 0) {
                                            employerobj.getDepartments().remove(Employee.getEmp_obj().get(i).getDepartment());
                                        }
                                        employerobj.getDepartments().put(department, employerobj.getDepartments().get(department) + 1);
                                    }
                                    Employee.getEmp_obj().get(i).setDepartment(department);
                                    System.out.println("department updated successfully");
                                    break;
                                case 5:
                                    System.out.println("enter employee type:");
                                    Employee.getEmp_obj().get(i).setEmp_type(br.readLine());
                                    System.out.println("employee type updated successfully");
                                    break;
                                case 6:
                                    System.out.println("enter band:");
                                    String band = br.readLine().toUpperCase();
                                    if (!employerobj.getBands().containsKey(band)) {
                                        employerobj.getBands().put(band, 1);
                                        employerobj.getBands().put(Employee.getEmp_obj().get(i).getBand(), employerobj.getBands().get(Employee.getEmp_obj().get(i).getBand()) - 1);
                                        if (employerobj.getBands().get(Employee.getEmp_obj().get(i).getBand()) == 0) {
                                            employerobj.getBands().remove(Employee.getEmp_obj().get(i).getBand());
                                        }

                                    } else {
                                        employerobj.getBands().put(Employee.getEmp_obj().get(i).getBand(), employerobj.getBands().get(Employee.getEmp_obj().get(i).getBand()) - 1);
                                        if (employerobj.getBands().get(Employee.getEmp_obj().get(i).getBand()) == 0) {
                                            employerobj.getBands().remove(Employee.getEmp_obj().get(i).getBand());
                                        }
                                        employerobj.getBands().put(band, employerobj.getBands().get(band) + 1);
                                    }
                                    Employee.getEmp_obj().get(i).setBand(band);
                                    System.out.println("band updated successfully");
                                    break;
                                case 7:
                                    System.out.println("enter A/C number:");
                                    Employee.getEmp_obj().get(i).setAc_number(Integer.parseInt(br.readLine()));
                                    System.out.println("A/C number updated successfully");
                                    break;
                                case 8:
                                    System.out.println("enter CTC:");
                                    Employee.getEmp_obj().get(i).setCtc(Double.parseDouble(br.readLine()));
                                    System.out.println("CTC updated successfully");
                                    break;
                                case 9:
                                    display(Employee.getEmp_obj().get(i));
                                    break b;
                                default:
                                    System.out.println("invalid input");
                            }
                        }
                    } else if (i == Employee.getEmp_obj().size() - 1) {
                        System.out.println("Employee doesn't found.");
                    }
                }
            }
        }catch (Exception exp)
        {
            System.out.println("invalid input");
        }
    }
    public void display(Employee te)
    {
        System.out.println(te.toString());
    }
    public void remove_emp()
    {
        try {
            System.out.println("enter employee id:");
            int id = Integer.parseInt(br.readLine());
            if (Employee.getEmp_obj().size() == 0)
                System.out.println("employee id not found");
            else {
                for (int i = 0; i < Employee.getEmp_obj().size(); i++) {
                    if (id == Employee.getEmp_obj().get(i).getEmp_id()) {
                        display(Employee.getEmp_obj().get(i));
                        employerobj.getLocations().put(Employee.getEmp_obj().get(i).getLocation(), employerobj.getLocations().get(Employee.getEmp_obj().get(i).getLocation()) - 1);
                        if (employerobj.getLocations().get(Employee.getEmp_obj().get(i).getLocation()) == 0)
                            employerobj.getLocations().remove(Employee.getEmp_obj().get(i).getLocation());
                        employerobj.getBands().put(Employee.getEmp_obj().get(i).getBand(), employerobj.getBands().get(Employee.getEmp_obj().get(i).getBand()) - 1);
                        if (employerobj.getBands().get(Employee.getEmp_obj().get(i).getBand()) == 0)
                            employerobj.getBands().remove(Employee.getEmp_obj().get(i).getBand());
                        employerobj.getDepartments().put(Employee.getEmp_obj().get(i).getDepartment(), employerobj.getDepartments().get(Employee.getEmp_obj().get(i).getDepartment()) - 1);
                        if (employerobj.getDepartments().get(Employee.getEmp_obj().get(i).getDepartment()) == 0)
                            employerobj.getDepartments().remove(Employee.getEmp_obj().get(i).getDepartment());
                        employerobj.getEmploye_dict().remove(id);
                        Employee.getEmp_obj().remove(i);
                        System.out.println("employee removed successfully");
                        break;
                    } else if (i == Employee.getEmp_obj().size() - 1) {
                        System.out.println("Employee id didn't found");
                    }
                }
            }
        }catch (Exception exe)
        {
            System.out.println("Invalid input");
        }
    }
    public void search_employee()
    {
        try {
            System.out.println("enter employee id:");
            int id = Integer.parseInt(br.readLine());
            if (Employee.getEmp_obj().size() == 0)
                System.out.println("employee id not found");
            else {
                for (int i = 0; i < Employee.getEmp_obj().size(); i++) {
                    if (id == Employee.getEmp_obj().get(i).getEmp_id()) {
                        display(Employee.getEmp_obj().get(i));
                        break;
                    } else if (i == Employee.getEmp_obj().size() - 1) {
                        System.out.println("employee id not found");
                    }
                }
            }
        }catch (Exception exe)
        {
            System.out.println("Invalid Input");
        }
    }
    public void print_all()
    {
        System.out.println(employerobj.toString());
    }
    public void pay_slip()
    {
        try {
            System.out.println("employee id:");
            int id = Integer.parseInt(br.readLine());
            if (Employee.getEmp_obj().size() == 0)
                System.out.println("employee id not found");
            else {
                for (int i = 0; i < Employee.getEmp_obj().size(); i++) {
                    if (id == Employee.getEmp_obj().get(i).getEmp_id()) {
                        System.out.println("enter month{MM-YYYY} of pay slip");
                        String month = br.readLine();
                        System.out.println("mess bill:");
                        double messbill = Double.parseDouble(br.readLine());
                        LocalDate transferdate = LocalDate.now();
                        Employee.getEmp_obj().get(i).getSalarySlip_obj().setBasic_salary((60 * Employee.getEmp_obj().get(i).getCtc() * 100000) / 100);
                        Employee.getEmp_obj().get(i).getSalarySlip_obj().setVariable_pay((30 * Employee.getEmp_obj().get(i).getCtc() * 100000) / 100);
                        Employee.getEmp_obj().get(i).getSalarySlip_obj().setProvident_fund((5 * Employee.getEmp_obj().get(i).getCtc() * 100000) / 100);
                        Employee.getEmp_obj().get(i).getSalarySlip_obj().setOther_allowance((5 * Employee.getEmp_obj().get(i).getCtc() * 100000) / 100);
                        if (Employee.getEmp_obj().get(i).getCtc() < 5) {
                            Employee.getEmp_obj().get(i).getSalarySlip_obj().setIncome_tax(0);
                        } else if (Employee.getEmp_obj().get(i).getCtc() >= 5 || Employee.getEmp_obj().get(i).getCtc() <= 10) {
                            Employee.getEmp_obj().get(i).getSalarySlip_obj().setIncome_tax((5 * Employee.getEmp_obj().get(i).getCtc() * 100000) / 100);
                        } else if (Employee.getEmp_obj().get(i).getCtc() > 10 || Employee.getEmp_obj().get(i).getCtc() <= 15) {
                            Employee.getEmp_obj().get(i).getSalarySlip_obj().setIncome_tax((10 * Employee.getEmp_obj().get(i).getCtc() * 100000) / 100);
                        } else if (Employee.getEmp_obj().get(i).getCtc() > 15 || Employee.getEmp_obj().get(i).getCtc() <= 20) {
                            Employee.getEmp_obj().get(i).getSalarySlip_obj().setIncome_tax((15 * Employee.getEmp_obj().get(i).getCtc() * 100000) / 100);
                        } else {
                            Employee.getEmp_obj().get(i).getSalarySlip_obj().setIncome_tax((20 * Employee.getEmp_obj().get(i).getCtc() * 100000) / 100);
                        }
                        Employee.getEmp_obj().get(i).getSalarySlip_obj().setMess_bill(messbill);
                        Employee.getEmp_obj().get(i).getSalarySlip_obj().setGross_pay((Employee.getEmp_obj().get(i).getCtc() * 100000));
                        Employee.getEmp_obj().get(i).getSalarySlip_obj().setNet_pay(Employee.getEmp_obj().get(i).getSalarySlip_obj().getGross_pay() - Employee.getEmp_obj().get(i).getSalarySlip_obj().getIncome_tax() - Employee.getEmp_obj().get(i).getSalarySlip_obj().getMess_bill());
                        Employee.getEmp_obj().get(i).setSalary_slip(month, Employee.getEmp_obj().get(i).getSalarySlip_obj());
                        System.out.println(transferdate + "\n" + Employee.getEmp_obj().get(i).getSalarySlip_obj().toString());

                        System.out.println("all pay slips:");
                        System.out.println(Employee.getEmp_obj().get(i).getSalary_slip());
                        break;
                    } else if (i == Employee.getEmp_obj().size() - 1) {
                        System.out.println("employee id not found");
                    }
                }
            }
        }catch (Exception exe)
        {
            System.out.println("Invalid Input");
        }
    }
}