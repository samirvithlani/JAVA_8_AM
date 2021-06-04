package chap1;

import java.util.Scanner;

public class VariableDemo {

	// class level variable declare :-
	int a; // instance variable... class level variable

	// signature fully q name of function

	// void =null
	// name of function
	// (paramn)

	void add() {

		// withput return type wo args
		int x = 100; // local variable...
		System.out.println("add function called.....");
		System.out.println(x);
		System.out.println(a);

	}

	// with return type without args

	// data type
	// 100 int
	int sum() {

		int a = 10, b = 20;
		int c = a + b;

		return c;
		// return a + b; pref
		// return 100;
	}

	// with r with args
	float pers(float maths, float science, float eng) {

		return (maths + science + eng) / 3;
	}

	double salaryCalulation(int emp1, float emp2, double emp3) {

		return emp1 + emp2 + emp3;
	}

	public static void main(String[] args) {

		// UDF Object
		// v1 -> local object
		VariableDemo v1 = new VariableDemo();
//		v1.add();
//
//		// x is loacal variable...
//		int x = v1.sum();
//		// what ans return it will print only..
//		System.out.println(v1.sum());
//		x = x + 20;
//		System.out.println("x = " + x);

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter maths marks");
//		float m = sc.nextFloat();
//		System.out.println("enter maths marks");
//		float s = sc.nextFloat();
//		System.out.println("enter maths marks");
//		float e = sc.nextFloat();
//		
//		
//		
//		float avg = v1.pers(m, s, e);
//		System.out.println("avg ="+avg);
//		

		v1.salaryCalulation(100, 100.25f, 25.25);
		//v1.salaryCalulation(100.20f, 100.25f, 25.25); Error
		
		

	}

}
