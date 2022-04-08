package 练习;

import java.util.Scanner;

public class 最佳牛围栏102 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {//输入牛的数量
			arr[i] = sc.nextInt();
		}
		//计算前缀和
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
