package day01;

import java.util.Scanner;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("请输入:");
		//创建Scanner对象，接收从控制台输入
		Scanner scanner = new Scanner(System.in);
		//接收String类型
		String string = scanner.next();
		//输出结果
		System.out.println("输入的是:"+string);
	}
}
