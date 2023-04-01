package com.payslip;

public class SalarySlip {
    private double basic_salary;
    private double variable_pay;
    private double provident_fund;
    private double other_allowance;
    private double income_tax;
    private double mess_bill;
    private double net_pay;
    private double gross_pay;

//    public double getBasic_salary() {
//        return basic_salary;
//    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

//    public double getVariable_pay() {
//        return variable_pay;
//    }

    public void setVariable_pay(double variable_pay) {
        this.variable_pay = variable_pay;
    }

//    public double getProvident_fund() {
//        return provident_fund;
//    }

    public void setProvident_fund(double provident_fund) {
        this.provident_fund = provident_fund;
    }

//    public double getOther_allowance() {
//        return other_allowance;
//    }

    public void setOther_allowance(double other_allowance) {
        this.other_allowance = other_allowance;
    }

    public double getIncome_tax() {
        return income_tax;
    }

    public void setIncome_tax(double income_tax) {
        this.income_tax = income_tax;
    }

    public double getMess_bill() {
        return mess_bill;
    }

    public void setMess_bill(double mess_bill) {
        this.mess_bill = mess_bill;
    }

//    public double getNet_pay() {
//        return net_pay;
//    }

    public void setNet_pay(double net_pay) {
        this.net_pay = net_pay;
    }

    public double getGross_pay() {
        return gross_pay;
    }

    public void setGross_pay(double gross_pay) {
        this.gross_pay = gross_pay;
    }

    @Override
    public String toString() {
        return "SalarySlip{" +
                "basic_salary=" + basic_salary +
                ", variable_pay=" + variable_pay +
                ", provident_fund=" + provident_fund +
                ", other_allowance=" + other_allowance +
                ", income_tax=" + income_tax +
                ", mess_bill=" + mess_bill +
                ", net_pay=" + net_pay +
                ", gross_pay=" + gross_pay +
                '}';
    }
}
