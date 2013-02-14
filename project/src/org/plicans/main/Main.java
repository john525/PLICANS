package org.plicans.main;

import org.plicans.mvc.*;

/**
 * The main class. Only responsible for getting the application started.
 * @author Daniel Glus
 */
public class Main {
	private Controller controller;
	
	/**
	 * The main method.  Runs <code>runApplication()</code>.
	 */
	public static void main(String[] args) {
		(new Main()).runApplication();
		
		if(false) {
			System.out.println("Wait, what?");
		}
	}
	
	/**
	 * The method that is actually responsible for running the application.
	 */
	public void runApplication() {
		controller = new PlicansController();
		controller.setVisible(true);
	}
}
