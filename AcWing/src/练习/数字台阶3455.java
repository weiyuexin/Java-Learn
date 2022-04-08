package Á·Ï°;

import java.util.Scanner;

public class Êý×ÖÌ¨½×3455 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(y == x-2) {
				if(x%2 == 0) {
					System.out.println(x+y);
				}else {
					System.out.println(x+y-1);
				}
			}else if(y == x) {
				if(x%2 == 0) {
					System.out.println(x+y);
				}else {
					System.out.println(x+y-1);
				}
			}else {
				System.out.println("No Number");
			}
			n--;
		}
		sc.close();
	}
}
