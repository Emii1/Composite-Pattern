package de.tum.in.ase.eist;

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


    public Supervisor(String name, Supervisor supervisedEmployees) {
        super(name);
        this.supervisedEmployees = supervisedEmployees;
    }

    public Supervisor getSupervisedEmployees() {
        return supervisedEmployees;
    }

    private Supervisor supervisedEmployees;




    // TODO 3: Implement listHierarchy() for Supervisor
}
