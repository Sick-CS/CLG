package chp8;

class A {

	public void meth1() {
		System.out.println("Meth1 called");

	}

	public void meth2() {
		System.out.println("meth2 called");
		meth1();
	}

	public void meth3() {
		try {
			meth2();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

public class Q2 {
	public static void main(String[] args) {
		A a = new A();
		a.meth3();
	}
}
