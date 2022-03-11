package ��ϰ;

import java.util.Scanner;

public class ���ķ�Χ789 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //�����Ԫ�ظ���
		int q = sc.nextInt();  //��ѯ�ĸ���
		
		int arr[] = new int[n];  //����һ������Ϊn������
		int find[] = new int[q];//q�β�ѯ��Ԫ��
		
		for(int i=0;i<n;i++) {  //��������Ԫ��
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<q;i++) {  //����q����ѯ
			find[i] = sc.nextInt();
		}
		
		for(int i=0;i<q;i++) {  
			int l=0,r=n-1;
			while(l<r) {
				int mid = (l+r)/2;
				if(arr[mid]>=find[i]) {
					r = mid;
				}else {
					l = mid+1;
				}
			}
			
			if(arr[l] != find[i]) {
				System.out.println("-1 -1");
			}else {
				System.out.print(l+" ");
				l=0;
				r=n-1;
				while(l<r) {
					int mid = (l+r+1)/2;
					if(arr[mid] <= find[i]) {
						l=mid;
					}else {
						r=mid-1;
					}
				}
				System.out.println(l);
			}
		}
		
		sc.close();
	}
}
