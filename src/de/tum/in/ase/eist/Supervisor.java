package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public  class Supervisor extends Employee {
    private final List<Employee> supervisedEmployees;


    public Supervisor(String name) {
        super(name);
        this.supervisedEmployees = new ArrayList<>();
    }



    // TODO 2: Implement the Supervisor class

    public void hireEmployee(Employee employee)  {

        supervisedEmployees.add(employee);
    }

    public void fireEmployee(Employee employee) {
        supervisedEmployees.remove(employee);
   }



    public List<Employee> getSupervisedEmployees() {
        return supervisedEmployees;
    }


    // TODO 3: Implement listHierarchy() for Supervisor

    public void listHierarchy(int level) {
       super.printName(level);
        for (Employee supervisedEmployee : supervisedEmployees) {
            supervisedEmployee.listHierarchy(level + 1);
        }

    }


}
