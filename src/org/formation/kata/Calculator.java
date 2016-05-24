package org.formation.kata;

public class Calculator {

	public int add(String str) {
		int number = 0;
		if (str.length() == 0) {
			number = 0;
		}
		if (str.length() >= 1){
			String[] pars = str.split(",|\n");// insert | between two seperators
			for (int i = 0; i <= pars.length - 1 ; i++) {
				number += Integer.parseInt(pars[i]);
			}
		}
		return number;
	}
}
