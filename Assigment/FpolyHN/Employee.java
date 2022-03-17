/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment.FpolyHN;

/**
 *
 * @author JosCongQuy
 */
public class Employee {
    private String code;   // mã 
    private String name;  // tên
    private Float basicSalary;  // lương cơ bản
    private Integer workdays;  // ngày công
    private Float businessSalary;  // lương  kinh doanh
    

    public Employee(String code, String name, Float basicSalary, Integer workdays, Float businessSalary) {
        this.code = code;
        this.name = name;
        this.basicSalary = basicSalary;
        this.workdays = workdays;
        this.businessSalary = businessSalary;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Integer getWorkdays() {
        return workdays;
    }

    public void setWorkdays(Integer workdays) {
        this.workdays = workdays;
    }

    public Float getBusinessSalary() {
        return businessSalary;
    }

    public void setBusinessSalary(Float businessSalary) {
        this.businessSalary = businessSalary;
    }

    @Override
    public String toString() {
        return "Employee" + "\ncode=" + code + "\nname=" + name + "\nbasicSalary=" + basicSalary + "\nworkdays=" + workdays + "\nbusinessSalary=" + businessSalary;
    }
    
    
    
}
