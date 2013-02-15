package org.plicans.mvc;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

import org.plicans.utils.*;

/**
 * The View that the program starts with.  Shows the 
 * @author Daniel Glus
 */
public class MainView extends View {
	private JFrame frame;
	@SuppressWarnings("unused")
	private Controller controller;
	private Model model;
	private Dimension frameSize;
	
	private JTextField dnaField;
	private JTextField rnaField;
	private JLabel abbreviatedProteinsLabel;
	
	private ProteinDisplayPanel proteinPanel;
	
	private Border defaultBorder;
	
	public MainView(Controller controller, Model model, Dimension size) {
		this.controller = controller;
		this.model = model;
		frameSize = size;
	}
	
	/**
	 * The method that actually builds the JFrame and all of its child components.  Does
	 * not display the frame.
	 */
	private void buildGUI() {
		frame = new JFrame("PLICANS (" + Globals.VERSION + ")");
		Font geneticFont = new Font(Font.MONOSPACED, Font.PLAIN, 11);
		JPanel geneticPanel = new JPanel(new GridLayout(3, 2));
		geneticPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		geneticPanel.add(new JLabel("DNA:"));
		dnaField = new JTextField(20);
		dnaField.setFont(geneticFont);
		dnaField.setName("dnaField");
		dnaField.addKeyListener(new FieldListener());
		geneticPanel.add(dnaField);
		geneticPanel.add(new JLabel("RNA:"));
		rnaField = new JTextField(20);
		rnaField.setFont(geneticFont);
		rnaField.setName("rnaField");
		rnaField.addKeyListener(new FieldListener());
		geneticPanel.add(rnaField);
		geneticPanel.add(new JLabel("Proteins:"));
		abbreviatedProteinsLabel = new JLabel("-");
		geneticPanel.add(abbreviatedProteinsLabel);
		frame.getContentPane().add(BorderLayout.WEST, geneticPanel);
		frame.setBounds(Helper.getCenteredBounds(frameSize));
		defaultBorder = dnaField.getBorder();
	}
	
	public void setVisible(boolean visible) {
		if(frame == null)
			buildGUI();
		frame.setVisible(visible);
	}
	
	public void refresh() {
		dnaField.setText(model.getDNA());
		rnaField.setText(model.getRNA());
		abbreviatedProteinsLabel.setText(model.getAbbreviatedProteins());
		if(Helper.isValidDNA(dnaField.getText())) {
			dnaField.setBorder(defaultBorder);
		} else {
			dnaField.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		if(Helper.isValidRNA(rnaField.getText())) {
			rnaField.setBorder(defaultBorder);
		} else {
			rnaField.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
	}
	
	private class FieldListener implements KeyListener {
		public void keyPressed(KeyEvent e) {
			
		}

		public void keyReleased(KeyEvent e) {
			if(e.getSource() instanceof JTextField) {
				JTextField source = (JTextField) e.getSource();
				String name = source.getName();
				if(name.equals("dnaField")) {
					model.setDNA(source.getText());
				} else if(name.equals("rnaField")) {
					model.setRNA(source.getText());
				}
				refresh();
			}
		}

		public void keyTyped(KeyEvent e) {
			
		}
	}
}