package basic_javaprograms;

public class Remove_All_Special_Characters {

	public static void main(String[] args) {
		String str = "$ja!va$&st%ar";

		// Using ReplaceAll() Method
		String replace = str.replaceAll("[^a-z A-Z 0-9]", " ");
		System.out.println(replace);

	}

}
