package 春季每日一题2022;

import java.util.Scanner;

public class 单词处理器1442 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i] = sc.next();
		}
		int len=0;
		for(int i=0;i<n;i++) {
			len += str[i].length();
			if(len>k) {
				System.out.println();
				len = 0;
				i--;
			}else if(i<n-1 && len+str[i+1].length()>k) {
				System.out.print(str[i]);
			}else {
				System.out.print(str[i]+" ");
			}
		}
		
		sc.close();
	}

}
