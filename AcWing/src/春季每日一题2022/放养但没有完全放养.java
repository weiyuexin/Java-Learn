package 春季每日一题2022;

import java.util.Scanner;

/**
 * @author wyx
 *
 */
public class 放养但没有完全放养 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		int[] p = new int[26];
		for(int i=0;i<26;i++)
			p[ch[i] - 'a'] = i;
		str = sc.next();
		ch = str.toCharArray();
		int res = 1;
		for(int i=1;i<ch.length;i++) {
			if(p[ch[i]-'a'] <= p[ch[i-1]-'a'])  //如果目标字符的下标小于它前一个字母的下表，则需要匹配下一个字符串
				res++;
		}
		System.out.print(res);
		sc.close();
	}

}
