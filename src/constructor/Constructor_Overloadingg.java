package constructor;

/*
 * Constructor Overloading means having more than one constructor in the same
 * class — but with different parameter lists (i.e., different number or type of
 * arguments). It’s a form of compile-time polymorphism (method overloading
 * type).
 */

class Employee {
	String name;
	int id;
	String department;

	// Default constructor
	Employee() {
		name = "Unknown";
		id = 0;
		department = "Not Assigned";
	}

	// Parameterized constructor (2 parameters)
	Employee(String n, int i) {
		name = n;
		id = i;
		department = "Not Assigned";
	}

	// Parameterized constructor (3 parameters)
	Employee(String n, int i, String dept) {
		name = n;
		id = i;
		department = dept;
	}

	void display() {
		System.out.println(name + " - " + id + " - " + department);
	}
}

public class Constructor_Overloadingg {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee("Shubham", 101);
		Employee e3 = new Employee("Neha", 102, "QA");

		e1.display();
		e2.display();
		e3.display();

	}

}
