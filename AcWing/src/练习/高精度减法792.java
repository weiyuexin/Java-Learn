package ��ϰ;

import java.math.BigInteger;
import java.util.Scanner;

public class �߾��ȼ���792 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.print((BigInteger)(a.subtract(b)));
		
		sc.close();
	}

}
