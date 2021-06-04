package chap1;

public class VariableDemo {

	// class level variable declare :-
	int a; // instance variable... class level variable

	// signature fully q name of function

	// void =null
	// name of function
	// (paramn)

	void add() {

		int x = 100; // local variable...
		System.out.println("add function called.....");
		System.out.println(x);
		System.out.println(a);

	}

	public static void main(String[] args) {

		// UDF Object
		// v1 -> local object
		VariableDemo v1 = new VariableDemo();
		v1.add();

	}

}
