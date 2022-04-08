package Á·Ï°;

import java.util.Scanner;
import java.math.BigInteger;
public class Çø¼äºÍ802 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arrN[][] = new int[n][2];
		int arrM[][] = new int[m][2];
		BigInteger arr[] = new BigInteger[m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arrN[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<2;j++) {
				arrM[i][j] = sc.nextInt();
				arr[i] = BigInteger.ZERO;
			}
		}
		
		for(int i=0;i<m;i++) {
			int l = arrM[i][0];
			int r = arrM[i][1];
			for(int j=0;j<n;j++) {
				if(arrN[j][0]>=l && arrN[j][0]<=r) {
					BigInteger bg = BigInteger.valueOf(arrN[j][1]);
					arr[i].add(bg);
				}
			}
			System.out.println(arr[i]);
		}
		
		
		sc.close();
	}
}
