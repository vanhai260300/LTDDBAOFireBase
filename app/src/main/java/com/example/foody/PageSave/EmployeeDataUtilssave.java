package com.example.foody.PageSave;

public class EmployeeDataUtilssave {

    public static Employeesave[] getEmployees() {
        Employeesave emp1 = new Employeesave("Mới nhất");
        Employeesave emp2 = new Employeesave("Gần tôi");
        Employeesave emp3 = new Employeesave("Xếp hạng");
        return new Employeesave[]{emp1, emp2, emp3};
    }
}

