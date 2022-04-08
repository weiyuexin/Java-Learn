package ����;

import java.util.Scanner;

public class AcCup��ȦȦ4376 {
	//��ȡȦ������
	public static int getQuanNum(char a) {
		if(a=='8' || a =='B') {
			return 2;
		}else if(a=='0' || a=='4' || a=='6' || a=='9' || a=='A' || a=='D') {
			return 1;
		}else {
			return 0;
		}
	}
	public static StringBuffer toSixteen(long n) {
		StringBuffer sb = new StringBuffer();
		char [] sign= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		if(n == 0) {
			sb.append(0);
		}
		while(n!=0) {
			int x = (int) (n%16);//��n������0ʱ�ȶ������࣬�мǲ����ȳ����ȳ��Ļ�n��ֵ�Ѹı�
			sb.append(sign[x]);//��StringBuffer�Ķ���s����append������������õ�������д��s
			n/=16;//�����������n��ֵ��������һ������
		}
		sb.reverse();//��StringBuffer���ṩ��reverse����������з�ת
		
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		StringBuffer sb = toSixteen(n);
		String str = sb.toString();
		char ch[] = str.toCharArray();
		long num=0;//Ȧ������
		for(int i=0;i<ch.length;i++) {
			num+=getQuanNum(ch[i]);
		}
		System.out.println(num);
		sc.close();
	}
}
