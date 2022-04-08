package 周赛;

import java.math.BigInteger;
import java.util.Scanner;

public class 周赛43_合适数对4316 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		int[] arr = new int[n+1];  
		for(int i=1;i<n+1;i++) {  //数组下标从1开始
			arr[i] = sc.nextInt();
		}
		
		
		
		
		long sum=0;
		for(int i=1;i<n+1;i++) {
			long x=0;
			for(int j=i;j<n+1;j++) {
				x+=arr[j];
				if(x<t) {
					sum++;
				}
			}
		}
		System.out.print(sum);
		
		sc.close();
	}
}
