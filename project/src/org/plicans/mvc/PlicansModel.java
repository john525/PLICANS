package org.plicans.mvc;

import org.plicans.utils.Helper;

public class PlicansModel extends Model {
	private String dna;

	public String getDNA() {
		return dna;
	}
	
	public void setDNA(String value) {
		dna = value;
	}
	
	public String getRNA() {
		return dnaToRna(dna);
	}
	
	public void setRNA(String value) {
		dna = rnaToDna(value);
	}
	
	public String getAbbreviatedProteins() {
		return Helper.toProtein(dna);
		
//		String rna = dnaToRna(dna);
//		StringBuilder ap = new StringBuilder();
//		for(int i = 0; i < rna.length(); i += 3) {
//			if(i + 2 < rna.length()) {
//				ap.append(Helper.codonToAminoAcid(rna.substring(i, i + 3)));
//			} else {
//				for(int j = 0; j < (rna.length() - i); j++) {
//					ap.append('.');
//				}
//			}
//			if(i + 3 < rna.length()) {
//				ap.append('-');
//			}
//		}
//		return ap.toString();
	}
	
	private String dnaToRna(String dna) {
		dna = dna.trim().toLowerCase();
		StringBuilder rna = new StringBuilder();
		for(char c:dna.toCharArray()) {
			if(c == 'a') rna.append('u');
			if(c == 't') rna.append('a');
			if(c == 'c') rna.append('g');
			if(c == 'g') rna.append('c');
		}
		return rna.toString();
	}
	
	private String rnaToDna(String rna) {
		rna = rna.trim().toLowerCase();
		StringBuilder dna = new StringBuilder();
		for(char c:rna.toCharArray()) {
			if(c == 'a') dna.append('t');
			if(c == 'u') dna.append('a');
			if(c == 'c') dna.append('g');
			if(c == 'g') dna.append('c');
		}
		return dna.toString();
	}
}