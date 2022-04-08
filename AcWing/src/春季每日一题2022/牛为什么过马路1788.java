package 春季每日一题2022;

import java.util.Scanner;

public class 牛为什么过马路1788 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] =new int[n][2];
		int ans = 0;
		for(int i=0;i<n;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((arr[i][0] == arr[j][0]) && (arr[i][1]+arr[j][1] == 1)) {
					
					ans++;
					break;
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
