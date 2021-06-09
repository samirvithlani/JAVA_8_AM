package chap1;

//BLOCKS
public class BlocksDemo {

	int a;
	// non static variable can not used in static block..
	// non satic and sttaic variable can be used in instance block..
	static int b;
	static {

		// a = 10;
		b = 20;
		System.out.println("static block 1 called....");
	}
	static {

		System.out.println("static block 2 called ...");
	}

	/// when you create an object class...
	{

		a = 100;
		b = 200;
		System.out.println("instance block..called...");
	}

	// zoom --> meet --> recording start... store.. file path file static
	// jsp servlet ->main -->
	// 1.6 jv without main...
	public static void main(String[] args) {

		System.out.println("main method....");

		// intance memory load...
		BlocksDemo b1 = new BlocksDemo();

	}
}
