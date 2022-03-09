/*
 * https://www.luogu.com.cn/problem/P1914
 */
package weiyuexin;

import java.util.Scanner;

public class P1914Ğ¡ÊéÍ¯¿­ÈöÃÜÂë {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char ch[] = str.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if(ch[i]+n>97+25) {
				System.out.print((char)((ch[i]+n)%(97+26)+'a'));
			}else {
				System.out.print((char)((ch[i]+n)));
			}
			
		}
		
		sc.close();
	}
}
