package chp8;

class MyException extends Exception {
	public MyException(String str) {
		System.out.println("My exception" + str);
	}
}

public class Q4 {
	public static void main(String[] args) {
		int age = 1;
		try {
			if (age < 18) {
				throw new MyException("Invalid");
			}

		} catch (MyException e) {
			System.out.println(e);
		}
	}
}
