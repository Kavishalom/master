package org.test;

public class GitClass {

/*public static void main(String[] args) {
	
String s = "Greens";

String rev = "";

for (int i = s.length()-1; i >=0; i--) {
	char c = s.charAt(i);
	
	rev= rev + c;
	
}
System.out.println(rev);*/

	
	public static void main(String[] args) {
		
		String s= "madam";
		String rev = "";
	
	for (int i = s.length()-1; i >=0; i--) {
		char c = s.charAt(i);
		
		rev = rev + c;
	}
	if (rev.equals(s)) {
		System.out.println("plaindrome");
	}
	else {
		System.out.println("Not a plaindrome");
	}
	
	}
	
}
