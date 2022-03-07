/*
 * https://www.luogu.com.cn/problem/P1428
 */
package weiyuexin;

import java.util.Scanner;

public class P1428–°”„±»ø…∞Æ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fish[] = new int[n];
		int keai[] = new int[n];
		for(int i=0;i<n;i++) {
			fish[i] = sc.nextInt();
			keai[i]=0;
		}
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				if(fish[i]>fish[j]) {
					keai[i]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(keai[i]+" ");
		}
		
		sc.close();
	}

}
