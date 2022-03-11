package 练习;

import java.util.Scanner;

public class 逆序对的数量788 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j])
					sum++;
			}
		}
		System.out.print(sum);
		
		sc.close();
	}
}
