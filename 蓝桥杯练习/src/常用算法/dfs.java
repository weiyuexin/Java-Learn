package �����㷨;

import java.util.Scanner;

public class dfs {

	static int n;//1��n��ȫ����
	static int []ans=new int[30];//�������
	static int []st=new int[30];//�������飬���kû�ù�,st[k]=0,����Ϊ1
	//dfs��ȫ����
	private static void dfs(int x) {
		if(x>n) {
			for(int i=1;i<=n;i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=n;i++) {
			if(st[i]==0) {
				st[i]=1;
				ans[x]=i;
				dfs(x+1);
				st[i]=0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		dfs(1);
	}
}
