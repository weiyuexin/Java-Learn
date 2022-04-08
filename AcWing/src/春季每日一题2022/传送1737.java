package 春季每日一题2022;

import java.util.Scanner;

public class 传送1737 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int d = Math.abs(b -a);
		int d1 = Math.abs(x-a) + Math.abs(y-b);
		int d2 = Math.abs(y-a) + Math.abs(x-b);
		d = Math.min(d, Math.min(d1, d2));
		System.out.println(d);
		sc.close();
	}
}
