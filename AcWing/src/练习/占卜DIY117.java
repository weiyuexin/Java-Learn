package ��ϰ;

import java.util.Scanner;

public class ռ��DIY117 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char puke[][] = new char[13][4];//����ľ�������
		int sign[][] = new int[13][4];//��ʶ���Ƿ񱻷�����
		//��ʼ��signΪ0��ʶû�б�������
		for(int i=0;i<13;i++) {
			for(int j=0;j<4;j++) {
				sign[i][j] = 0;
			}
		}
		//�������ֻ���ĸ
		for(int i=0;i<13;i++) {
			for(int j=0;j<4;j++) {
				puke[i][j] = sc.next().toCharArray()[0];
			}
		}
		
		
		
		
		for(int i=0;i<13;i++) {
			for(int j=0;j<4;j++) {
				
			}
			
		}
		sc.close();
	}
}
