package 春季每日一题2022;

import java.util.*;

public class 方形牧场1812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x11,x12,y11,y12,x21,x22,y21,y22,x,y; 
		
		x11 = sc.nextInt();
		y11 = sc.nextInt();
		x12 = sc.nextInt();
		y12 =sc.nextInt();
		
		x21 = sc.nextInt();
		y21 = sc.nextInt();
		x22 = sc.nextInt();
		y22 =sc.nextInt();
		
		x = Math.max(Math.max(Math.abs(x11-x22), Math.abs(x12-x21)),Math.max(Math.abs(x11-x12), Math.abs(x21-x22)));
		y = Math.max(Math.max(Math.abs(y11-y22), Math.abs(y12-y21)),Math.max(Math.abs(y11-y12), Math.abs(y21-y22)));
		
		x = Math.max(x, y);
		System.out.println(x*x);
		
		
		sc.close();
	}

}
