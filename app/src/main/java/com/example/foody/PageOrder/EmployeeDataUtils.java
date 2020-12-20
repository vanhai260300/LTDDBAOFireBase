package com.example.foody.PageOrder;

public class EmployeeDataUtils {

    public static Employee[] getEmployees() {
        Employee emp1 = new Employee("Tất cả");
        Employee emp2 = new Employee("Đồ ăn");
        Employee emp3 = new Employee("Thực phẩm");
        Employee emp4 = new Employee("Bia");
        Employee emp5 = new Employee("Hoa");
        return new Employee[]{emp1, emp2, emp3,emp4,emp5};
    }
}

