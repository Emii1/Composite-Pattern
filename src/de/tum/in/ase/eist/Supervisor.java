package de.tum.in.ase.eist;

import java.util.List;

public abstract class Supervisor extends Employee {

    public Supervisor(String name) {
        super(name);
    }

    // TODO 2: Implement the Supervisor class
    public void hireEmployee(Employee employee) {

    }
   public void fireEmployee(Employee employee){}

    public void listHierarchy(int level){

    }

    private List<Employee> supervisedEmployees;







    // TODO 3: Implement listHierarchy() for Supervisor
}
