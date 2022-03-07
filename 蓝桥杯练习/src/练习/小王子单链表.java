/*
 * https://www.lanqiao.cn/courses/3993/learning/?id=250138
 */

package 练习;
import java.util.*;
public class 小王子单链表 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wan[] = {1,2,3,4,5,6,7,8,9,10};
		int m = sc.nextInt();
		int x[] =new int[m];
		for(int j=0;j<m;j++) {
			x[j] = sc.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			int temp = x[i];
			
			for(int j=temp-1;j>0;j--) {
				System.out.println(wan[j]);
				wan[j] = wan[j-1];
			}
			wan[0] = temp;
			
			for(int j=0;j<10;j++) {
				System.out.print(wan[j]+" ");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
