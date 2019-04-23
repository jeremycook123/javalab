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

//CODE1:
//Ensure that HourlyEmployee inherits from Employee 
public class HourlyEmployee extends Employee {
    
    //Instance fields
    private double hoursWorked;
    private double hourRate;

    public HourlyEmployee() {
    }

    //CODE2:
    //Define a constructor that accepts a name and a employee number, and use
    //the constructor of the parent class Employee
    public HourlyEmployee(String name, int empID) {
        super(name, empID);
    }

    //CODE3:
    //Define getter and setter methods for hoursWorked and hourRate
    public double getHourRate() {
        return hourRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    //CODE4:
    //Override the calcSalary method and calculate the salary based on hoursWorked
    public double calcSalary() {
        return this.hourRate * this.hoursWorked;
    }
}