package ��ϰ;

import java.util.Scanner;

public class �������η���790 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double l = -10000, r = 10000;
		double mid = 0.0;
		//ʹ�ö��ַ����
		while(r-l>1e-8) {  //������λС��������������߽���б߽�Ĳ����10^-8
			mid = (r+l)/2;
			if(Math.pow(mid, 3)>=n) {  //���е������
				r = mid;
			}else {//���е���Ұ��
				l = mid;
			}
		}
		System.out.print(String.format("%.6f", mid));
		
		sc.close();
	}
}
