package ����ÿ��һ��2022;

import java.util.Scanner;

/**
 * @author wyx
 *
 */
public class ������û����ȫ���� {
	
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
			if(p[ch[i]-'a'] <= p[ch[i-1]-'a'])  //���Ŀ���ַ����±�С����ǰһ����ĸ���±�����Ҫƥ����һ���ַ���
				res++;
		}
		System.out.print(res);
		sc.close();
	}

}
