package 周赛;

import java.math.BigInteger;
import java.util.Scanner;

public class 周赛43_三元组4314 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		for(int i=1;i<=n-2;i++) {
			for(int j=i+1;j<=n-1;j++) {
				for(int k=j+1;k<=n;k++) {
					if((i^j^k)==0 && (i+j>k && i+k>j && j+k>i)) {
						num++;
					}
				}
			}
		}
		System.out.println(num);
		sc.close();
	}
}
