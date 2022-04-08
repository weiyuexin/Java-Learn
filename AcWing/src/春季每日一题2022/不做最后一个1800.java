package 春季每日一题2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 不做最后一个1800 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> kvMap = new HashMap<String, Integer>();
		kvMap.put("Bessie", 0);
		kvMap.put("Elsie", 0);
		kvMap.put("Daisy", 0);
		kvMap.put("Gertie", 0);
		kvMap.put("Annabelle", 0);
		kvMap.put("Maggie", 0);
		kvMap.put("Henrietta", 0);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String string = sc.next();
			int num = sc.nextInt();
			kvMap.put(string, kvMap.get(string)+num);
		}
		int[] sum =new int[7]; 
		sum[0]=kvMap.get("Bessie");
		sum[1]=kvMap.get("Elsie");
		sum[2]=kvMap.get("Daisy");
		sum[3]=kvMap.get("Gertie");
		sum[4]=kvMap.get("Annabelle");
		sum[5]=kvMap.get("Maggie");
		sum[6]=kvMap.get("Henrietta");
		Arrays.sort(sum);
		System.out.println(sum[1]);
		
		sc.close();
	}
}
