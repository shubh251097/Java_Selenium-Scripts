package polymorphism;

public class Method_Overloading2 {

	static int a = 10;
	static int b = 20;
	static int c = 30;

	public static void add(int a) {
		System.out.println(a);
	}

	public static void add(int a, int b) {

		System.out.println(a + b);
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		Method_Overloading2.add(a);
		Method_Overloading2.add(a, b);
		Method_Overloading2.add(a, b, c);

	}

}
