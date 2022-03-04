package weiyuexin;

import java.util.Scanner;

public class 字符判空 {

	public static void main(String[] args) {
		char ch1 = ' ',ch2='a';
		//判断字符是否为空格使用Character.isSpace(ch)
		if(Character.isSpace(ch1)) {
			System.out.println("ch1是空格");
		}else {
			System.out.println("ch1不是空格");
		}
		if(Character.isSpace(ch2)) {
			System.out.println("ch2是是空格");
		}else {
			System.out.println("ch2不是空格");
		}
		//判断字符是否为空的方法ch=='\0'
		if(ch1=='\0') {
			System.out.println("ch1为空值");
		}else {
			System.out.println("ch1不为空值");
		}
		if(ch2=='\0') {
			System.out.println("ch2为空值");
		}else {
			System.out.println("ch2不为空值");
		}
		//判断字符为换行符
		char ch3 = '\n';
		if(ch3 == '\n') {
			System.out.println("ch3是换行符");
		}
		//读入包含字符串的方法sc.nextLine()
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个包含空格的字符串:");
		String str = sc.nextLine();
		System.out.println("输入的字符串是:   "+str);
	}
}
