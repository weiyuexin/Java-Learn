package weiyuexin;
import java.util.Arrays;//需要导入Arrays包
import java.util.Scanner;

public class sort排序函数 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入数组元素个数:");
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		//Arrays.sort(array,2,4); //升序排序
		System.out.print("升序输出:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n降序排序输出:");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		sc.close();
	}

}
