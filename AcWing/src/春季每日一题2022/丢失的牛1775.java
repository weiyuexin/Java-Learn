package ����ÿ��һ��2022;

import java.util.Scanner;

public class ��ʧ��ţ1775 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x =sc.nextInt();
		int y =sc.nextInt();
		
		int mv=1; //��һ���ƶ��ľ���
		int ans=0;  //�ܹ���Ҫ�ƶ��ľ���
		if(x<y) {
			int xx =x+mv;
			while(xx<y) {
				ans+=(Math.abs(mv)+Math.abs(mv/2));
				xx = x+mv;
		        mv *=-2;
			}
			if(xx>y) {
				ans = ans-(x+Math.abs(mv/2)-y);
			}
		}
		if(x>y) {
			int xx =x+mv;
			while(xx>y) {
				ans+=(Math.abs(mv)+Math.abs(mv/2));
				xx = x+mv;
		        mv *=-2;
			}
			if(xx<y) {
				ans = ans-(y-x+Math.abs(mv/2));
			}
		}
		
		System.out.println(ans);
		
		
		
		sc.close();
	}

}
