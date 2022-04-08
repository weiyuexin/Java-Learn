package 练习;

import java.math.BigInteger;
import java.util.Scanner;

public class 高精度乘法793 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.print(a.multiply(b));
		sc.close();
	}
}
