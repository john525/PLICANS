package org.plicans.mvc;

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
	
	private String dnaToRna(String dna) {
		dna = dna.trim().toUpperCase();
		StringBuilder rna = new StringBuilder();
		for(char c:dna.toCharArray()) {
			if(c == 'A') rna.append('U');
			if(c == 'T') rna.append('A');
			if(c == 'C') rna.append('G');
			if(c == 'G') rna.append('C');
		}
		return rna.toString();
	}
	
	private String rnaToDna(String rna) {
		rna = rna.trim().toUpperCase();
		StringBuilder dna = new StringBuilder();
		for(char c:rna.toCharArray()) {
			if(c == 'A') dna.append('T');
			if(c == 'U') dna.append('A');
			if(c == 'C') dna.append('G');
			if(c == 'G') dna.append('C');
		}
		return dna.toString();
	}
}