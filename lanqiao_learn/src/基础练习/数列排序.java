package 基础练习;

import java.util.Scanner;

public class 数列排序 {

	public static void main(String[] args) {
		//输入个数
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] shulie=new int[n];
		for(int i=0;i<n;i++) {
			shulie[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(shulie[j]<shulie[i]) {
					int temp=shulie[j];
					shulie[j]=shulie[i];
					shulie[i]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(i!=n-1) {
				System.out.print(shulie[i]+" ");
			}else {
				System.out.print(shulie[i]);
			}
		}
	}
}
