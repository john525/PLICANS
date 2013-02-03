package org.plicans.mvc;

import java.awt.Dimension;

public class PlicansController extends Controller {
	private View view;
	private Model model;
	
	public PlicansController() {
		model = new PlicansModel();
		view = new MainView(this, model, new Dimension(400, 200));
	}
	
	/**
	 * Sets whether or not the current View is visible.
	 * @param visible Whether or not the view should be visible.
	 */
	public void setVisible(boolean visible) {
		view.setVisible(visible);
	}
}
