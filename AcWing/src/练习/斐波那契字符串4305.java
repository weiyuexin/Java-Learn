package Á·Ï°;

import java.util.Scanner;

public class ì³²¨ÄÇÆõ×Ö·û´®4305 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fb[] = new int[1000];
		for(int i=0;i<1000;i++) {
			if(i==0)fb[i]=1;
			else if(i==1)fb[i]=1;
			else fb[i] = fb[i-1]+fb[i-2];
		}
		for(int i=1;i<=n;i++) {
			boolean flag = false;
			for(int j=1;j<1000;j++) {
				if(i==fb[j]) {
					System.out.print('O');
					
					flag = true;
				}
			}
			if(flag == false)
				System.out.print('o');
		}
		
		
		
		sc.close();
	}

}
