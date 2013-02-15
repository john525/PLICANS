package org.plicans.utils.data;

import java.util.HashMap;

public class BioData {
	
	private static HashMap<String, String> t;
	
	static {
		t = new HashMap<String, String>();
		t.put("AUG", ">M"); //Note that we are using one-letter protein abbrs.
		t.put("AUA", "I");
		t.put("AUC", "I");
		t.put("AUU", "I");
		t.put("CUU", "I");
		t.put("CUC", "I");
		t.put("CUA", "I");
		t.put("CUG", "I");
		t.put("UUA", "I");
		t.put("UUG", "I");
		t.put("UUU", "F");
		t.put("UUC", "F");
		t.put("GUU", "V");
		t.put("GUC", "V");
		t.put("GUA", "V");
		t.put("GUG", "V");
		t.put("UCU", "S");
		t.put("UCC", "S");
		t.put("UCA", "S");
		t.put("UCG", "S");
		t.put("CCU", "P");
		t.put("CCC", "P");
		t.put("CCA", "P");
		t.put("CCG", "P");
		t.put("ACU", "T");
		t.put("ACC", "T");
		t.put("ACA", "T");
		t.put("ACG", "T");
		t.put("GCT", "A");
		t.put("GCC", "A");
		t.put("GCA", "A");
		t.put("GCG", "A");
		t.put("UAU", "Y");
		t.put("UAC", "Y");
		t.put("CAU", "H");
		t.put("CAC", "H");
		t.put("CAA", "");
		t.put("CAG", "Q");
		t.put("AAU", "N");
		t.put("AAC", "N");
		t.put("AAA", "K");
		t.put("AAG", "K");
		t.put("GAU", "D");
		t.put("GAC", "D");
		t.put("GAA", "E");
		t.put("GAG", "E");
		t.put("UGU", "C");
		t.put("UGC", "C");
		t.put("CGU", "R");
		t.put("CGC", "R");
		t.put("CGA", "R");
		t.put("CGG", "R");
		t.put("AGU", "S");
		t.put("AGC", "S");
		t.put("AGA", "R");
		t.put("AGG", "R");
		t.put("GGU", "G");
		t.put("GGC", "G");
		t.put("GGA", "G");
		t.put("GGG", "G");
		t.put("UGA", "<");//Opal
		t.put("UAA", "<");//Ochre
		t.put("UAG", "<");//Amber
	}
	
	public static String getAA(String codon) {
		if(t.containsKey(codon)) {
			return t.get(codon);
		}
		else {
			return "_ERR_";
		}
	}
}
