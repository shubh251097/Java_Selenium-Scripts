package string_programs;

public class ToLowerCase {

	public static void main(String[] args) {
		String str1 = "HEXAWARE";
		String str2 = "hexaware";

		// Find length of string
		System.out.println(str1.length());
		System.out.println(str2.length());

		// Convert to lower case
		System.out.println(str1.toLowerCase());

		// Convert to upper case
		System.out.println(str2.toUpperCase());

		// Compare two strings
		boolean compare = str1.equals(str2);
		System.out.println(compare);

		// Concat two strings
		String str3 = new String("Shubham");
		str3.concat("IT COMPANY");
		//
		System.out.println(str3);

		// Reverse the string using StringBuffer
		StringBuffer sb = new StringBuffer("Sultane");
		sb.append(str3);
		System.out.println(sb);
		System.out.println(sb.reverse());

		// Reverse using StringBuilder
		StringBuilder sb1 = new StringBuilder(str2);
		System.out.println(sb1.reverse());

	}

}
