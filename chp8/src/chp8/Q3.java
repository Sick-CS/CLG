package chp8;

public class Q3 {
	public static void main(String[] args) {
		try {
			int num = 20 / 0;
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Block executed");
		}
	}
}
