package 春季每日一题2022;

import java.util.Scanner;

public class 水桶传递队列1470 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[][] ch = new char[10][10];
		for(int i=0;i<10;i++) {
			String string = sc.next();
			for(int j=0;j<10;j++) {
				ch[i][j] = string.charAt(j);
			}
		}
		index b = new index();
		index r = new index();
		index l = new index();
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(ch[i][j] == 'B') {
					b.x=i;
					b.y=j;
				}
				if(ch[i][j] == 'L') {
					l.x=i;
					l.y=j;
				}
				if(ch[i][j] == 'R') {
					r.x=i;
					r.y=j;
				}
			}
		}
		int ans = Math.abs(b.x-l.x)+Math.abs(b.y-l.y);
		//判断三个点是否在一条线上且石头在中间
		if(b.x==r.x && r.x==l.x && (b.y-r.y)*(l.y-r.y)<0 || b.y==r.y && r.y==l.y && (b.x-r.x)*(l.x-r.x)<0) { 
			ans+=2;
		}
		System.out.println(ans-1);
		
		sc.close();
	}
}
class index{
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
