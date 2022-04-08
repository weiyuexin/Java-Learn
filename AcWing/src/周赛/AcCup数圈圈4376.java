package 周赛;

import java.util.Scanner;

public class AcCup数圈圈4376 {
	//获取圈数函数
	public static int getQuanNum(char a) {
		if(a=='8' || a =='B') {
			return 2;
		}else if(a=='0' || a=='4' || a=='6' || a=='9' || a=='A' || a=='D') {
			return 1;
		}else {
			return 0;
		}
	}
	public static StringBuffer toSixteen(long n) {
		StringBuffer sb = new StringBuffer();
		char [] sign= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		if(n == 0) {
			sb.append(0);
		}
		while(n!=0) {
			int x = (int) (n%16);//当n不等于0时先对其求余，切记不可先除，先除的话n的值已改变
			sb.append(sign[x]);//用StringBuffer的对象s调用append方法，将求余得到的余数写入s
			n/=16;//再求除，更新n的值，进行下一次求余
		}
		sb.reverse();//用StringBuffer中提供的reverse方法对其进行反转
		
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		StringBuffer sb = toSixteen(n);
		String str = sb.toString();
		char ch[] = str.toCharArray();
		long num=0;//圈的数量
		for(int i=0;i<ch.length;i++) {
			num+=getQuanNum(ch[i]);
		}
		System.out.println(num);
		sc.close();
	}
}
