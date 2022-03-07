/*
 * https://www.luogu.com.cn/problem/P1554
 */
package weiyuexin;

import java.util.Scanner;

public class P1554梦中的统计 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		m = sc.nextInt();
		n = sc.nextInt();
		int num[] =new int[10];
		for(int i=0;i<10;i++) {
			num[i] = 0;
		}
		for(int i=m;i<=n;i++) {
			String str = String.valueOf(i);
			
			char ch[] = str.toCharArray();
			
			for(int j=0;j<ch.length;j++) {
				  if(ch[j]=='0') num[0]++; if(ch[j]=='1') num[1]++; if(ch[j]=='2') num[2]++;
				  if(ch[j]=='3') num[3]++; if(ch[j]=='4') num[4]++; if(ch[j]=='5') num[5]++;
				  if(ch[j]=='6') num[6]++; if(ch[j]=='7') num[7]++; if(ch[j]=='8') num[8]++;
				  if(ch[j]=='9') num[9]++;
				 
				
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(num[i]+" ");
		}
		
		sc.close();
	}
}
