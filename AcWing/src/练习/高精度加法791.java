package 练习;

import java.math.BigInteger;
import java.util.Scanner;

public class 高精度加法791 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger sum = a.add(b);
		System.out.print(sum);
		sc.close();
	}
}
