package weiyuexin;
import java.util.Arrays;//��Ҫ����Arrays��
import java.util.Scanner;

public class sort������ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������Ԫ�ظ���:");
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		//Arrays.sort(array,2,4); //��������
		System.out.print("�������:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n�����������:");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		sc.close();
	}

}
