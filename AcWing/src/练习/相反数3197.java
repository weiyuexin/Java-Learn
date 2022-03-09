
/*
 * https://www.acwing.com/problem/content/description/3200/
 */
package Á·Ï°;

import java.util.Scanner;

public class Ïà·´Êý3197 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i] == -arr[j]) {
					sum++;
				}
			}
		}
		System.out.println(sum);
		
		sc.close();
	}
}
