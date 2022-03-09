package 练习;

import java.util.Scanner;

public class 两点间的距离616 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		double x1,x2,y1,y2;
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		double dis = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2));
		System.out.println(String.format("%.4f", dis));
		
		
		sc.close();
	}
}
