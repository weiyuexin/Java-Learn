/*
 * https://www.lanqiao.cn/problems/504/learning/
 * */
package ����;
import java.util.*;
public class ���ʷ��� {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     //�ڴ��������Ĵ���...
		 
	     String str = scan.next();//������ַ���
	     
	     int length = str.length();//�����ַ����ĳ���
	     
	     char[] zimu = new char[length];//���ַ����е�ÿһ����ĸȡ�������浽һ������
	     
	     for(int i=0;i<length;i++) {
	    	 zimu[i] = str.charAt(i);
	     }
	     
	     int[] num = new int[length];//ÿһ����ĸ���ֵĴ���
	     char[] zm = new char[length];//ȥ�غ����ĸ����
	     zm[0] = str.charAt(0);
	     for(int i = 0;i<length;i++) {
	    	 num[i] = 0;
	     }
	     int sum=1;//��ǰ���ֵ���ĸ������
	     for(int i=0;i<length;i++) {
	    	 boolean flag = false;//����ĸ�Ƿ���������ĸ�ظ���Ĭ��Ϊ��
	    	 for(int j=0;j<sum;j++) {  //��ȡ�����ַ����е�һ���ַ�����ĸ����Աȣ����һ�������Ӧ��������һ�������³��ֵ���ĸ��ӵ���ĸ������
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
	     int maxnum=0;//�ַ����ֵ�������
	     char ch = str.charAt(0); //����������ĸ,Ĭ��������ĸ
	     for(int i=0;i<zm.length;i++) {//ѭ���ҵ����ֵ
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
