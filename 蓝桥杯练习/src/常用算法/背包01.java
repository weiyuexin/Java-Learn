package �����㷨;

public class ����01 {

	public static void main(String[] args) {
		int [][]f=new int[5][9];//f��ʾ���Ž�
		int []w= {0,2,3,4,5};//��ʾ����,һ�����ļ���Ʒ
		int []v= {0,3,4,5,8};//��ʾ��ֵ
		
		for(int i=1;i<5;i++) {//i��ʾ��Ʒ��j��ʾ��������
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
