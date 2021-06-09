package chap1;

//public class can not be static

public class StaticDemo2 {

	static int x;
	// static instance variable can be used in non static method
	// static insrance variable can bu used in static method
	int p; // non sttaic
	// non static variable can be use in non sttaic method...
	// non statuc vatiable can not be used in static method

	static void demo2() {

		// static int abc = 100; error can not use static key word inside method..
		// static int abc = 100;
		x = 500;
		// p = 200; error

	}
	void demo() {

		// static int abc = 100; error can not use static key word inside method..
		// static int abc = 100;

		x = 100;
		p = 200;
		System.out.println(x);
	}

	public static void main(String[] args) {

		// p =20; error
	}
}
