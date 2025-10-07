package constructor;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	Child() {
		super(); // calls parent constructor
		System.out.println("Child constructor");
	}
}

public class CallParentClassConstructorUsingSuper {

	public static void main(String[] args) {
		new Child(); // 👈 Calls parent then child constructor

	}

}
