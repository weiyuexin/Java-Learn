package weiyuexin;
import java.util.Arrays;
import java.util.Scanner;

public class sortÅÅĞòº¯Êı {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÊı×éÔªËØ¸öÊı:");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array); //ÉıĞòÅÅĞò
		System.out.print("ÉıĞòÊä³ö:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n½µĞòÅÅĞòÊä³ö:");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		sc.close();
	}

}
