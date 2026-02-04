package polymorphism;

public class Method_Overloading {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;

	}

	public long add(long a, long b) {
		long sub = b - a;
		return sub;

	}

	public static void main(String[] args) {
		Method_Overloading obj = new Method_Overloading();
		int result1 = obj.add(10, 20);
		System.out.println("Sum of two numbers: " + result1);

		int result2 = obj.add(10, 20, 30);
		System.out.println("Sum of three numbers: " + result2);

		long result3 = obj.add(50500L, 105500L);
		System.out.println("Subtraction of two numbers: " + result3);
	}
}