package org.test;

public class UpperCase {

	public static void main(String[] args) {
		
		String s = "PrakaSh@123.";
		String up ="";
		String lo ="";
		String num = "";
		String sp="";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (Character.isUpperCase(c)) {
				up = up + c;
			}
			else if (Character.isLowerCase(c)) {
				lo = lo + c;
				
			}
			else if (Character.isDigit(c)) {
				num = num + c;
				
			}
			else {
				sp = sp + c;
			}
				
		}
			System.out.println("upper case " + up);
			System.out.println("lower case " + lo);
			System.out.println("Digit " + num);
		System.out.println("Special " + sp);
		
		
	}
	
	
}
