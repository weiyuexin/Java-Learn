package weiyuexin;

import java.util.Scanner;

//https://www.luogu.com.cn/problem/P4414
public class P4414 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		char[] xu = new char[3];
		String str;
		for(int i=0;i<3;i++) {
			num[i] = sc.nextInt();
		}
		str = sc.next();
		for(int i=0;i<3;i++) {    //循环将字符串转换成字符
			//xu[i] = sc.next().charAt(0);  //获取输入字符的方法
			xu[i] = str.charAt(i);
		}
		for(int i=0;i<3;i++) {
			for(int j=i;j<3;j++) {
				if(num[i]>num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		int a=num[0],b=num[1],c=num[2];
		for(int i=0;i<3;i++) {
			if(xu[i] == 'A') {
				num[i] = a;
			}
			if(xu[i] == 'B') {
				num[i] = b;
			}
			if(xu[i] == 'C') {
				num[i] = c;
			}
		}
		for(int i=0;i<3;i++) {
			if(i!=2) {
				System.out.print(num[i]+" ");
			}else {
				System.out.print(num[i]);
			}
		}
		
		sc.close();
	}
}
