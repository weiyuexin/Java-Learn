package weiyuexin;

import java.util.Scanner;
//��Ŀ��
//https://www.luogu.com.cn/problem/P1085
public class luoguP1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
		int[] b = new int[7];
		for(int i=0;i<7;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int flag=0;  //�Ƿ񲻸��˵ı�־
		int max=0;   //����˵�ֵ
		int date=0;  //����˵�����
		for(int i=0;i<7;i++) {
			if(a[i]+b[i]>8) {
				flag = 1;
				if(a[i]+b[i]>max) {
					max = a[i]+b[i];
					date = i+1;
				}
			}
		}
		if(flag == 0) {
			System.out.println(flag);
		}else {
			System.out.println(date);
		}
		
		
		
		sc.close();
	}
}
