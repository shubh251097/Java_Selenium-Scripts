package interface_I;

public class MyClass implements MyInterface {

	@Override
	public void myMethod() {
		System.out.println("Implementation of myMethod in MyClass");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cannot directly instantiate MyInterface: MyInterface obj = new MyInterface();
		// // Compile-time error

		// Create an object of the implementing class and refer to it by the interface

//MyClass class=new MyClass();
		MyInterface obj = new MyClass();
		obj.myMethod(); // Calls the implemented method in MyClass
	}
}
