package 春季每日一题2022;

import java.util.Scanner;

public class 奶牛体操1459 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[k+1][n+2];
		for(int i=1;i<=k;i++)
			for(int j=1;j<=n;j++) {
				int x = sc.nextInt();
				arr[i][x] = j;
			}
		int sum = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				boolean flag = true;
				for(int x=1;x<=k;x++) {
					if(arr[x][i]>=arr[x][j])
						flag = false;
				}
				if(flag) sum++;
			}
			
		
		}
		System.out.print(sum);
		
		sc.close();
	}

}
