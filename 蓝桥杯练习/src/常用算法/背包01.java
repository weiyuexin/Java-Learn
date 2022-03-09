package 常用算法;

public class 背包01 {

	public static void main(String[] args) {
		int [][]f=new int[5][9];//f表示最优解
		int []w= {0,2,3,4,5};//表示重量,一共有四件物品
		int []v= {0,3,4,5,8};//表示价值
		
		for(int i=1;i<5;i++) {//i表示物品，j表示背包容量
			for(int j=1;j<9;j++) {
				if(w[i]>j) {
					f[i][j]=f[i-1][j];
				}else {
					f[i][j]=Math.max(f[i-1][j-w[i]]+v[i], f[i-1][j]);
				}
			}
		}
		System.out.println(f[4][8]);
	}
}
