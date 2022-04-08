package 练习;

import java.util.Scanner;
import java.math.*;
public class 项链158 {

	public static String getMin(String a) {
		int length = a.length();//项链的长度
		//Integer.valueOf(a):将字符串转换为整数
		String str = a+a;
		BigInteger min = new BigInteger("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
		for(int i=0;i<length;i++) {
			String s=new String();
			s = str.substring(i,i+length); //截取长度为length的一段
			//System.out.println(s);
			BigInteger bg = new BigInteger(s);
			if(min.compareTo(bg)==1) {
				min = bg;
			}
		}
		return min.toString();
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a,b;
		a = sc.next();
		b = sc.next();
		if(getMin(a).equals(getMin(b))) {
			if(getMin(a).length()==a.length()) {
				System.out.println("Yes\n"+getMin(a));
			}else {
				System.out.println("Yes");
				for(int i=0;i<(a.length()-getMin(a).length());i++){
					System.out.print("0");
				}
				System.out.print(getMin(a));
			}
		}else {
			System.out.print("No");
		}
		
		sc.close();
	}
}
