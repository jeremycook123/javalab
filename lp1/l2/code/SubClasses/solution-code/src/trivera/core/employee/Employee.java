package trivera.core.employee;

/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of Trivera Technologies, LLC
 *
 * Copyright (c) 2019 Trivera Technologies, LLC.
 * http://www.triveratech.com   
 * </p>
 * @author Trivera Technologies Tech Team.
 */

//CODE5:
//Subclass - an Employee is a special type of Person
public class Employee extends Person {

    private int empID;
    private Employee manager;

    //CODE6:
    // Create empty constructor
    // Create constructor that initialises the name and empID
    public Employee() {
    }

    public Employee(String name, int empID) {
        super(name);
        this.empID = empID;
    }

    //CODE7:
    // Implement getter methods for the empID and manager fields
    public int getEmpID() {
        return empID;
    }

    public Employee getManager() {
        return manager;
    }

    //CODE8:
    // Implement setter methods for the empID and manager fields
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    //CODE9:
    // Implement business logic method to calculate salary
    public double calcSalary() {
        return 0.0;
    }

    //CODE10:
    // Override the toString method    
    public String toString() {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append(" - empID: ").append(empID);
        return sb.toString();
    }
}
