package henu;

import java.util.Scanner;

/*
 * �ճ���null����ֱ������������������
 * ��������true�����true��false�����false
 * �ַ������õ�����''���ַ�������ʹ��˫����""
 * 
 * */
public class hello {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(false);
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("������n:");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("���,"+i);
		}
		sc.close();
	}
}
