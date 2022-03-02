/*
 * 
 * 数据类型
 *              基本数据类型
 *             	数值型
 *             		整数（byte,short,int,long）
 *             		浮点数（float,double）
 *             		字符
 *                             非数值型
 *                                      布尔（boolean）
 *              引用数据类型
 *  			类（class）
 *   			接口（interface）
 *   			数组（[]）
 * */



package henu;

public class 数据类型 {

	public static void main(String args[]) {
		//整数默认类型是int，10000000000超出了int的范围所以会报错，需要在后面加L标识这个数是long类型的
		long l = 10000000000L;
		System.out.println(l);
		//小数类型默认是都变了，13.14赋值给float类型的变量会报错，需要在后边加F标识这个数是浮点数
		float f = 13.14F;
		System.out.println(f);
	}
}
