package 周赛;

import java.util.*;

public class 周赛42_最小数_4311 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		double ans[] = new double[n];
		for(int i=0;i<n;i++) {
			ans[i] = (double)(a[i])/(double)(b[i]);
		}
		Arrays.sort(ans);
		System.out.println(String.format("%.6f", m*ans[0]));//String.format()用来格式化输出小数
		
		sc.close();
	}

}
