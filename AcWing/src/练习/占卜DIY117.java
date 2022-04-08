package 练习;

import java.util.Scanner;

public class 占卜DIY117 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char puke[][] = new char[13][4];//输入的具体牌型
		int sign[] = new int[13];//标识牌是否被反过来的个数
		//初始化sign为0标识没有被反过来
		for(int i=0;i<13;i++) {
			sign[i] = 0;
		}
		//输入数字或字母
		for(int i=0;i<13;i++) {
			for(int j=0;j<4;j++) {
				puke[i][j] = sc.next().toCharArray()[0];
			}
		}
		
		int sm = 4;
		while(sm>0) {
			
			
		}
		
		
		
		
		/*
		 * for(int i=0;i<13;i++) { for(int j=0;j<4;j++) { System.out.print(puke[i][j]);
		 * } System.out.println();
		 * 
		 * }
		 */
		sc.close();
	}
}
