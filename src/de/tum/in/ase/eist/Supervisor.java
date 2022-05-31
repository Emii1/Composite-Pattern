package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public  class Supervisor extends Employee {
    public Supervisor(String name) {
        super(name);
        List<Employee> supervisedEmployees = new ArrayList<>();
    }


    // TODO 2: Implement the Supervisor class

    public void hireEmployee(Employee employee)  {

    }

    public void fireEmployee(Employee employee) {

   }

    public void listHierarchy(int level) {

    }

    public List<Employee> getSupervisedEmployees() {
        return supervisedEmployees;
    }

    public Supervisor(String name, List<Employee> supervisedEmployees) {
        super(name);
        this.supervisedEmployees = supervisedEmployees;
    }

    private List<Employee> supervisedEmployees;








    // TODO 3: Implement listHierarchy() for Supervisor
}
