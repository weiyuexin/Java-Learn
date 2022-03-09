package Á·Ï°;

import java.util.Scanner;

public class ¸´ÖÆÊý×é814 {
	public static void copy(int a[],int b[],int size) {
		for(int i=0;i<size;i++) {
			b[i] = a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m = sc.nextInt();
		int size = sc.nextInt();
		int arrn[] = new int[n];
		int arrm[] = new int[m];
		for(int i=0;i<n;i++) {
			arrn[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			arrm[i] = sc.nextInt();
		}
		copy(arrn,arrm,size);
		
		sc.close();
	}
}
