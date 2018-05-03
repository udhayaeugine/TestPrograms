package com.Eugine.TestPrgrm;

public class Cricketter {
	String Name;
	int runs;

	public Cricketter(String Name, int runs) {
		super();
		this.Name = Name;
		this.runs = runs;

	}

	public String toString() {
		return Name + " " + runs;
	}

}
