/*
 * https://www.lanqiao.cn/problems/504/learning/
 * */
package 真题;
import java.util.*;
public class 单词分析 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     //在此输入您的代码...
		 
	     String str = scan.next();//输入的字符串
	     
	     int length = str.length();//输入字符串的长度
	     
	     char[] zimu = new char[length];//将字符串中的每一个字母取出，保存到一个数组
	     
	     for(int i=0;i<length;i++) {
	    	 zimu[i] = str.charAt(i);
	     }
	     
	     int[] num = new int[length];//每一个字母出现的次数
	     char[] zm = new char[length];//去重后的字母数组
	     zm[0] = str.charAt(0);
	     for(int i = 0;i<length;i++) {
	    	 num[i] = 0;
	     }
	     int sum=1;//当前出现的字母种类数
	     for(int i=0;i<length;i++) {
	    	 boolean flag = false;//该字母是否与已有字母重复，默认为否
	    	 for(int j=0;j<sum;j++) {  //将取出的字符串中的一个字符与字母数组对比，如果一样，则对应的数量加一，否则将新出现的字母添加到字母数组中
	    		 if(zimu[i] == zm[j]) {
	    			 num[j]++;
	    			 flag = true;
	    		 }
	    	 }
	    	 if(flag == false) {
	    		 zm[sum] = zimu[i];
	    		 num[sum] = 1;
	    		 sum++;
	    	 }
	     }
	     
			/*
			 * for(int i=0;i<length;i++) { System.out.print(zm[i]+" "); } for(int
			 * i=0;i<length;i++) { System.out.print(num[i]+" "); }
			 */
	     int maxnum=0;//字符出现的最大次数
	     char ch = str.charAt(0); //出现最多的字母,默认是首字母
	     for(int i=0;i<zm.length;i++) {//循环找到最大值
	    	 if(maxnum<num[i]) {
	    		 maxnum = num[i];
	    		 ch = zm[i];
	    	 }
	     }
	     System.out.println(ch);
	     System.out.println(maxnum);

	     
	     scan.close();
	}

}
