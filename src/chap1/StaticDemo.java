package chap1;

public class StaticDemo {

	int a = 100; // instance variable

	static int x = 0; // instance static variable

	static int sum(int p) {

		x = p;
		return x;
	}

	int demo(int b) {

		x = b;
		return x;
	}

	public static void main(String[] args) {

		
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		
		// 3 copy
		// 3 copy
		System.out.println(s1.demo(100));
		System.out.println(s2.demo(200));
		System.out.println(s3.demo(300));
		
		
		System.out.println(StaticDemo.sum(100));
		System.out.println(StaticDemo.sum(200));
	}
}
