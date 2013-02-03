package org.plicans.mvc;

/**
 * Represents the window on the screen, or the GUI.
 * Responsible for displaying the information that the Model has.
 * The class from which all other Views inherit from.
 * @author Daniel Glus
 */
public abstract class View {
	/**
	 * Sets whether or not the window controlled by the View is visible.
	 * @param visible Whether or not the window should be visible.
	 */
	public abstract void setVisible(boolean visible);
	
	/**
	 * Refreshes the View.
	 */
	public abstract void refresh();
}
