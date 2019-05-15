package trivera.update.lambda.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2019 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class SimpleSwing extends JFrame {

	//CODE2.1:Create add action method using lambda notation for listner
	private void addAction(JButton button) {
		button.addActionListener(event -> System.out.println("Button Clicked"));
	}

	//CODE2.2:Define init method and add button with custom action
	public void init() {
		JButton button = new JButton("Push me!");
		addAction(button);
		add(button);
	}

	public static void main(String[] args) {
        System.out.println("Exercise: Lambda.SimpleSwing");
        System.out.println("Type: solution-code");
        System.out.println("Java: " + System.getProperty("java.version"));

		//CODE2.3:Launch simple swing app
		SimpleSwing swing = new SimpleSwing();
		swing.init();
		swing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		swing.setTitle("Simple Swing");
		swing.setLocationRelativeTo(null);
		swing.pack();
		swing.setVisible(true);
	}
}
