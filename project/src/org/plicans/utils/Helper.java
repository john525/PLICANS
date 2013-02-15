package org.plicans.utils;

/**
 * A class that contains helpful methods.
 * @author Daniel Glus
 */
import java.awt.*;

public abstract class Helper {
	/**
	 * Takes the specified dimension and returns bounds for that dimension that center
	 * the dimension on the screen.
	 * @param dimension The size of the component.
	 * @return The centered bounds for that component.
	 */
	public static Rectangle getCenteredBounds(Dimension dimension) {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - dimension.width)/2;
		int y = (screen.height - dimension.height)/2;
		Rectangle result = new Rectangle(x, y, dimension.width, dimension.height);
		return result;
	}
	
	/**
	 * Takes the smaller dimension and returns bounds for that dimension centered on the larger
	 * dimension
	 * @param smaller The size of the smaller dimension
	 * @param larger The dimension that the smaller dimension should be centered on
	 * @return The centered bounds for the smaller dimension
	 */
	public static Rectangle getCenteredBounds(Dimension smaller, Dimension larger) {
		int x = (larger.width - smaller.width)/2;
		int y = (larger.height - smaller.height)/2;
		Rectangle result = new Rectangle(x, y, smaller.width, smaller.height);
		return result;
	}

	public static Rectangle getCenteredBounds(int width, int height) {
		return getCenteredBounds(new Dimension(width, height));
	}
	
	public static String formatMoney(int money) {
		return String.format("$%,d", money);
	}
	
	public static String formatComma(int number) {
		return String.format("%,d", number);
	}
	
	public static boolean isValidDNA(String dna) {
		for(char c:dna.toCharArray()) {
			if(c != 'a') {
				if(c != 't') {
					if(c != 'c') {
						if(c != 'g') {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	public static boolean geneIndexOf(String dna) {
		return dna.indexOf("AUG");
	}
	
	public static boolean geneEnd(String dna) {
		return Math.min( Math.min(dna.indexOf("UAA"), dna.indexOf("UGA")), dna.indexOf("UAG") );
	}
	
	public static boolean isValidRNA(String rna) {
		for(char c:rna.toCharArray()) {
			if(c != 'a') {
				if(c != 'u') {
					if(c != 'c') {
						if(c != 'g') {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	public static String toProtein() {
		
	}
	
	public static String codonToAminoAcid(String s) {
		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);
		if(a == 'u') {
			if(b == 'u') {
				if(c == 'u' || c == 'c') {
					return "Phe";
				} else if(c == 'a' || c == 'g') {
					return "Leu";
				}
			}
		}
		else if(a == )
		return "ERR";
	}
}
