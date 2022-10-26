package org.greatLearning;

import department.AdminDepartment;
import department.HrDepartment;
import department.SuperDepartment;
import department.TechDepartment;


public class Main {
    public static void main(String[] args) {

        //SuperDepartment adminDepartment = new AdminDepartment();
        AdminDepartment adminDepartment = new AdminDepartment();
        System.out.println("Welcome to " + adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday() + "\n");

        //SuperDepartment hrDepartment = new HrDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        System.out.println("Welcome to " + hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday() + "\n");

        //SuperDepartment techDepartment = new TechDepartment();
        TechDepartment techDepartment = new TechDepartment();
        System.out.println("Welcome to " + techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadLine());
        System.out.println(techDepartment.getTechStackInformantion());
        System.out.println(techDepartment.isTodayAHoliday() + "\n");
    }
}
