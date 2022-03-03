/*
 * https://www.luogu.com.cn/problem/P5733
 * 
 */

package weiyuexin;

import java.util.Scanner;

public class P5733 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i] -= 32;
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}
	}
}
