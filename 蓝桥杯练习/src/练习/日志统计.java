package ��ϰ;

import java.util.Scanner;

public class ��־ͳ�� {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,d,k;
		n = sc.nextInt();
		d = sc.nextInt();
		k = sc.nextInt();
		int[] ts = new int[n];
		int[] id = new int[n];
		for(int i=0;i<n;i++) {
			ts[i] = sc.nextInt();
			id[i] = sc.nextInt();
		}
		sc.close();
	}
}
