package Á·Ï°;

import java.util.Scanner;

public class ´òÓ¡×Ö·û´®815 {

	public static void print(char sta[]) {
		for(int i=0;i<sta.length;i++) {
			System.out.print(sta[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		print(ch);
		sc.close();
	}
}
