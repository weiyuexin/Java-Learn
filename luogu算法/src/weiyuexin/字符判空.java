package weiyuexin;

import java.util.Scanner;

public class �ַ��п� {

	public static void main(String[] args) {
		char ch1 = ' ',ch2='a';
		//�ж��ַ��Ƿ�Ϊ�ո�ʹ��Character.isSpace(ch)
		if(Character.isSpace(ch1)) {
			System.out.println("ch1�ǿո�");
		}else {
			System.out.println("ch1���ǿո�");
		}
		if(Character.isSpace(ch2)) {
			System.out.println("ch2���ǿո�");
		}else {
			System.out.println("ch2���ǿո�");
		}
		//�ж��ַ��Ƿ�Ϊ�յķ���ch=='\0'
		if(ch1=='\0') {
			System.out.println("ch1Ϊ��ֵ");
		}else {
			System.out.println("ch1��Ϊ��ֵ");
		}
		if(ch2=='\0') {
			System.out.println("ch2Ϊ��ֵ");
		}else {
			System.out.println("ch2��Ϊ��ֵ");
		}
		//�ж��ַ�Ϊ���з�
		char ch3 = '\n';
		if(ch3 == '\n') {
			System.out.println("ch3�ǻ��з�");
		}
		//��������ַ����ķ���sc.nextLine()
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�������ո���ַ���:");
		String str = sc.nextLine();
		System.out.println("������ַ�����:   "+str);
	}
}
