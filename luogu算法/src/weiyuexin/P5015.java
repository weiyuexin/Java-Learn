/*
 * https://www.luogu.com.cn/problem/P5015
 */

package weiyuexin;

import java.util.Scanner;

public class P5015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();  //��ȡһ������(�����ո�)��next��ȡ�ַ����Կո�Ϊ�ָ���
		char[] ch = str.toCharArray(); //���ַ���ת��Ϊ�ַ�����
		int sum = 0;
		for(int i=0;i<ch.length;i++) {
			//Character.isSpace(ch)�����ж��ַ��Ƿ�Ϊ�ո�ch!='\0'�ж��ַ��Ƿ�Ϊ�գ�ch[i]!='\n'�ж��ַ��Ƿ�Ϊ���з�
			if(!Character.isSpace(ch[i]) && ch[i]!='\n') { 
				sum++;
			}
		}
		System.out.print(sum);
	}

}
