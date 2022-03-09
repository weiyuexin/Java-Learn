package 练习;

import java.util.Scanner;

public class 数的三次方根790 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double l = -10000, r = 10000;
		double mid = 0.0;
		//使用二分法求解
		while(r-l>1e-8) {  //保留六位小数，所以所以左边界和有边界的差大于10^-8
			mid = (r+l)/2;
			if(Math.pow(mid, 3)>=n) {  //在中点的左半边
				r = mid;
			}else {//在中点的右半边
				l = mid;
			}
		}
		System.out.print(String.format("%.6f", mid));
		
		sc.close();
	}
}
