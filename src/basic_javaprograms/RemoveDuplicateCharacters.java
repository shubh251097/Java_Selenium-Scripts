package basic_javaprograms;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// String str = "programming";

		// Using StringBuilder class
		// StringBuilder sb = new StringBuilder();
		// str.chars().distinct().forEach(c -> sb.append((char) c));
		// System.out.println(sb);

		// Approach
		String str1 = "Welcome to Java Programming";
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			int ind = str1.indexOf(ch, i + 1);
			if (ind == -1) {
				sb1.append(ch);

			}
		}

	}

}
