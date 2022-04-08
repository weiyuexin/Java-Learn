package 春季每日一题2022;

import java.util.Scanner;

public class 混合牛奶1714 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[4];
		int[] m = new int[4];
		
		for(int i=1;i<4;i++) {
			c[i] = sc.nextInt();
			m[i] = sc.nextInt();
		}
		
		for(int i=1;i<=100;i++) {
			if(i%3 == 1) {
				if(m[1] !=0 && m[2] != c[2]) {
					int x = c[2]-m[2];
					if(x>m[1]) {
						m[2] +=m[1];
						m[1] = 0;
					}else {
						m[2] +=x;
						m[1] -=x;
					}
				}
			}
			if(i%3 == 2) {
				if(m[2] !=0 && m[3] != c[3]) {
					int x = c[3]-m[3];
					if(x>m[2]) {
						m[3] +=m[2];
						m[2] = 0;
					}else {
						m[3] +=x;
						m[2] -=x;
					}
				}
			}
			if(i%3 == 0) {
				if(m[3] !=0 && m[1] != c[1]) {
					int x = c[1]-m[1];
					if(x>m[3]) {
						m[1] +=m[3];
						m[3] = 0;
					}else {
						m[1] +=x;
						m[3] -=x;
					}
				}
			}
		}
		for(int i=1;i<4;i++) {
			System.out.println(m[i]);
		}
		sc.close();
	}

}
