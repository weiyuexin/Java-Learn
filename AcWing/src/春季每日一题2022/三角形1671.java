package 春季每日一题2022;

import java.util.Scanner;

public class 三角形1671 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(i!=j && j!=k && i!=k && x[i] == x[j] && y[j] == y[k]) {
						max = Math.max(max, Math.abs(y[j] - y[i])*Math.abs(x[j] - x[k]));
					}
				}
			}
		}
		System.out.print(max);
		
		
		sc.close();
	}

}
