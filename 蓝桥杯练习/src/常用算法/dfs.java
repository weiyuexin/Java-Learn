package 常用算法;

import java.util.Scanner;

public class dfs {

	static int n;//1到n的全排列
	static int []ans=new int[30];//用来存答案
	static int []st=new int[30];//记忆数组，如果k没用过,st[k]=0,否则为1
	//dfs求全排列
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
