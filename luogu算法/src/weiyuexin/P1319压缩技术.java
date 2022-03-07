package weiyuexin;

import java.util.Scanner;

public class P1319压缩技术 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1; // 点的个数，当是n的倍数时换行
		int flag = 0; // 标识当前输出的是0还是1
		int x = 1;
		while (sc.hasNextInt()) {
			int sum = sc.nextInt();
			for (int i = 0; i < sum; i++) {
				if(flag == 0) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
				if (num % n == 0) {
					System.out.println();
				}
				num++;
			}
			x++;
			if (x % 2 == 0) {
				flag = 1;
			} else {
				flag = 0;
			}
		}
	}
}
