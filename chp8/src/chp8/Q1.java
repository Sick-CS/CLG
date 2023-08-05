package chp8;

public class Q1 {
	public static void main(String[] args) {
		try {
			int num = 18 / 0;
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
