package 练习;

import java.util.Scanner;

//模拟
public class 报数3282 {
	public static boolean check1(int n) {
		if(n%7 == 0)//是7的倍数
			return false;
		else
			return true;
	}
	public static boolean check2(int n) {
		String str = String.valueOf(n);
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == '7') {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = {0,0,0,0,0};
		int x=1;
		int num=0;
		while(num<n) {
			if(check1(x) && check2(x)) {
				//System.out.print(x+" ");
				num++;
			}else {
				if(x%4==0) {
					arr[4]++;
				}else {
					arr[x%4]++;
				}
			}
			
			x++;
		}
		//System.out.println();
		for(int i=1;i<=4;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
