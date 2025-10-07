package constructor;

class Demo {
	Demo() {
		System.out.println("Constructor called!");
	}
}

// Creating an object of the class will call the constructor
public class CallConstructorUsingNewKeyword {

	public static void main(String[] args) {

		Demo obj1 = new Demo(); // 👈 Constructor is called here

	}

}
