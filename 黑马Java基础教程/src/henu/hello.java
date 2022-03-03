package henu;

import java.util.Scanner;
import java.lang.Math;
/*
 * 空常量null不能直接输出，否则会编译错误
 * 布尔常量true输出是true，false输出是false
 * 字符常量用单引号''，字符串常量使用双引号""
 * 
 * */
public class hello {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(false);
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入n:");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("你好,"+i);
		}
		System.out.println(Math.pow(4, 2));// Math.pow(double a,double b)表示幂函数
		
		
		sc.close();
	}
}
