/*
 * https://www.luogu.com.cn/problem/P5015
 */

package weiyuexin;

import java.util.Scanner;

public class P5015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();  //读取一行数据(包含空格)，next读取字符串以空格为分隔符
		char[] ch = str.toCharArray(); //将字符串转换为字符数组
		int sum = 0;
		for(int i=0;i<ch.length;i++) {
			//Character.isSpace(ch)用来判断字符是否为空格，ch!='\0'判断字符是否为空，ch[i]!='\n'判断字符是否为换行符
			if(!Character.isSpace(ch[i]) && ch[i]!='\n') { 
				sum++;
			}
		}
		System.out.print(sum);
	}

}
