package basic_javaprograms;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		String str = " ja va st ar ";

		// By using trim method in String class
		String trimmedstr = str.trim();
		System.out.println(trimmedstr);
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		// System.out.println(str.replaceAll("\\s", ""));

	}

}
