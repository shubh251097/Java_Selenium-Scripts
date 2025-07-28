package basic_javaprograms;

public class Reverse_String {

	public static void main(String[] args) {
		String str = "Shubham";
//Using String Buffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Original String is:" + str);
		System.out.println("Reversed String is:" + sb.reverse());
//Using String Builder
		String str1 = "Sultane";
		StringBuilder sb1 = new StringBuilder(str1);
		System.out.println("Original string is:" + str1);
		System.out.println("Reversed string is:" + sb1.reverse());
// Using toCharArray method
		String str2 = "Hello World";

		char[] ch = str2.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println("Reverse String is:" + ch[i]);
		}

	}
}
