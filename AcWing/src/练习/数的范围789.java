package 练习;

import java.util.Scanner;

public class 数的范围789 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //数组的元素个数
		int q = sc.nextInt();  //查询的个数
		
		int arr[] = new int[n];  //定义一个长度为n的数组
		int find[] = new int[q];//q次查询的元素
		
		for(int i=0;i<n;i++) {  //输入数组元素
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<q;i++) {  //输入q个查询
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
