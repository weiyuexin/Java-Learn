package 周赛;

import java.util.Scanner;

public class 周赛42_出现次数_4312 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,m,q;
		
		n = sc.nextInt();
		m = sc.nextInt();
		q = sc.nextInt();
		
		String S = sc.next();
		String T = sc.next();
		
		char chs[] = S.toCharArray();
		char cht[] = T.toCharArray();
		int l[] = new int[q];
		int r[] = new int[q];
		for(int i=0;i<q;i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		if(n<m) {
			for(int i=0;i<q;i++) {
				System.out.println("0");
			}
		}else {
			for(int k=0;k<q;k++) {
				int sum=0;
				for(int i=l[k]-1;i<r[k];) {
					for(int j=0;j<m;) {
						if(chs[i] == cht[j]) {
							j++;
							if(j==m) {
								sum++;
								i++;
							}
						}else {
							i++;
						}
						if(i==r[k])break;
					}
				}
				System.out.println(sum);
			}
		}
		
		sc.close();
	}
}
