package weiyuexin;

import java.util.Scanner;

public class P1427小鱼的数字游戏 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[100];
		int n=0;
		for(int i=0;;i++) {
			int x =sc.nextInt();
			if(x!=0) {
				num[n]=x;
				n++;
			}else {
				break;
			}
		}
		for(int i=n-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
		
		sc.close();
	}
}
