package 春季每日一题2022;

import java.util.Scanner;

public class 围栏刷漆1866 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b = sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int ans=0;
		
		if(a>=c&&a>=d || b<=c&& b<=d) {
			ans+=(b-a)+(d-c);
		}else if(a<=c&&b>=d || a>=c&&b<=d) {
			ans+=Math.max(b-a, d-c);
		}else if(c<=a&&d>=a || c<=b&&d>=b) {
			ans+=Math.max(b, d) - Math.min(a, c);
		}
		
		
		System.out.println(ans);
		
		sc.close();
	}

}
