package chp8;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		try {

			int[] arr = new int[5];
			arr[5] = 89 / 0;
			System.out.println(arr[5]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
