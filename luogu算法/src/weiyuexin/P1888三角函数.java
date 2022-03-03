package weiyuexin;

import java.util.Scanner;

public class P1888三角函数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < 3; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		//约分
		int min = num[0];
		int max = num[2];
		int flag = 0;
		int yueshu = 0;
		for (int i = 1; i <= min; i++) {
			if (min % i == 0 && max % i == 0) {
				yueshu = i;
			}
		}
		if(yueshu == 0) {
			System.out.print(min +"/"+max);
		}else {
			System.out.print(min/yueshu + "/" + max/yueshu);
		}
	}
}
