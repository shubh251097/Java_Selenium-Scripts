package constructor;

class Test {
	Test() {
		this(10); // calls parameterized constructor
		System.out.println("Default constructor");
	}

	Test(int x) {
		System.out.println("Parameterized constructor with value: " + x);
	}
}

public class CallConstructorUsingthis {
	public static void main(String[] args) {
		new Test(); // Calls default constructor, which calls parameterized one

	}

}
