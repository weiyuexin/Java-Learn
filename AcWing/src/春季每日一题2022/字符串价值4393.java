package 春季每日一题2022;

import java.util.Scanner;

public class 字符串价值4393 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] v = new int[5];
		for(int i=1;i<5;i++) {
			v[i] = sc.nextInt();
		}
		
		String string = sc.next();
		int len = string.length();
		char[] ch = string.toCharArray();
		int sum=0;
		for(int i=0;i<len;i++) {
			sum+=v[ch[i]-48];
		}
		System.out.println(sum);
		
		sc.close();
	}
	
	
}
