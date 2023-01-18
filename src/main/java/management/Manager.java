package management;

import staff.Employee;

public class Manager extends Employee {
    private String departmentName;

    public Manager(String name, String ni, Double salary, String departmentName){
        super(name, ni, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
