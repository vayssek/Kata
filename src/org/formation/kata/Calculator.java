package org.formation.kata;

public class Calculator {

	public static void main(String[] args) {

	}

	public int add(String str) {
		int number = 0;
		if (str.length() == 0) {
			number = 0;
		}
		if (str.length() == 1){
			number=Integer.parseInt(str);
		}
		if (str.length() > 1){
			for (int i = 0; i <= str.length() - 1 ; i++) {
				number += Integer.parseInt(str);
			}
		}
		return number;
	}
}
