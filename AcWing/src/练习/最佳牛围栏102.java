package ��ϰ;

import java.util.Scanner;

public class ���ţΧ��102 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {//����ţ������
			arr[i] = sc.nextInt();
		}
		//����ǰ׺��
		for(int i=1;i<n;i++) {
			arr[i] += arr[i-1];
		}
		double max =0;
		int l = 0,r = n-1;
		while(r-l>f) {
			
		}
		
		sc.close();
	}
}
