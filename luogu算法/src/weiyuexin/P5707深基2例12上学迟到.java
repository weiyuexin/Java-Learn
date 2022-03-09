package weiyuexin;

import java.util.Scanner;

public class P5707深基2例12上学迟到 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int v = sc.nextInt();
		int m = (int) ((s/v+1)/1);
		int h = m/60;
		m = m%60;
		if(h<7) {
			int x = (8-1-h);
			int y = (60-10-m);
			String xx,yy;
			if(x<10) {
				 xx = "0"+String.valueOf(x);
			}else {
				 xx = String.valueOf(x);
			}
			if(y<10) {
				 yy = "0"+String.valueOf(y);
			}else {
				 yy = String.valueOf(y);
			}
			System.out.println(xx+":"+yy);
		}else if(h==7){
			int y = (60-10-m);
			String yy;
			if(y<10) {
				 yy = "0"+String.valueOf(y);
			}else {
				 yy = String.valueOf(y);
			}
			System.out.println("00:"+yy);
		}
		else if(h==8 && m==0) {
			System.out.print("00:00");
		}else {
			int x = (24-(h-7));
			int y = (60-10-m);
			String xx,yy;
			if(x<10) {
				 xx = "0"+String.valueOf(x);
			}else {
				 xx = String.valueOf(x);
			}
			if(y<10) {
				 yy = "0"+String.valueOf(y);
			}else {
				 yy = String.valueOf(y);
			}
			System.out.print(xx+":"+yy);
		}
		sc.close();
	}
}
