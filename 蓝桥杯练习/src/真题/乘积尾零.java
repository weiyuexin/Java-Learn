package ����;

import java.math.BigInteger;
import java.util.Scanner;

public class �˻�β�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger sum =new BigInteger("0");
		while(sc.hasNextInt()) {
			BigInteger x = sc.nextBigInteger();
			sum = sum.multiply(x);
		}
		System.out.println(sum);
	}
}
