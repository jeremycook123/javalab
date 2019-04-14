package trivera.core.fields;

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

public class FieldTest {

    //CODE1:
    //Declare four uninitialized private instance fields
    //variable named string of type String
    //variable named x of type int
    //variable named y of type double
    //variable named yn of type boolean

    public FieldTest() {
        super();

        //CODE2:
        //Create local variable x = 5

        //CODE3:
        //Print out each of the four instance fields

        //Remember that local variable x will hide instance field x         
        //How do we specify that we want the instance field and not the variable?

        //CODE4:
        //Print out the local variable x
    }

    public static void main(String[] args) {
        System.out.println("Exercise: FieldTest");
        System.out.println("Type: lab-code");
        System.out.println("Java: " + System.getProperty("java.version"));

        //CODE5:
        //Create an instance of this class using the basic constructor
    }
}