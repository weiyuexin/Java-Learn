package 重要知识;

import java.math.BigDecimal;  //引入BigDecimal用于高精度运算
import java.math.BigInteger;  //引入math包中的BigInteger包
import java.util.*;

public class Java大数运算 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//BigInteger大整数运算
		BigInteger b1 = new BigInteger("1231243244124412");  //第一种初始化方法，参数是字符串
	    BigInteger b2 = BigInteger.valueOf(123124234);  //第二种初始化方法，参数可以是int、long
	    System.out.println("加法操作："+b2.add(b1));  //加法
        System.out.println("减法操作："+b2.subtract(b1));  //减法
        System.out.println("乘法操作："+b2.multiply(b1));  //乘法
        System.out.println("除法操作："+b2.divide(b1)); //除法
        System.out.println("最大数："+b2.max(b1));//最大值
        System.out.println("最小数："+b2.min(b1)); //最小值
        BigInteger result[]=b2.divideAndRemainder(b1);  //商和余数
        System.out.println("商是："+result[0]+" "+"余数是："+result[1]);
        
        System.out.println("-------------------------------------");
        
        
        //BigDecimal用于小数的高精度运算
        System.out.println("加法运算：" + MyMath.round(MyMath.add(10.345, 3.333), 1));
        System.out.println("减法运算：" + MyMath.round(MyMath.sub(10.345, 3.333), 3));
        System.out.println("乘法运算：" + MyMath.round(MyMath.mul(10.345, 3.333), 4));
        System.out.println("除法运算：" + MyMath.div(10.345, 3.333, 3));
	}

}
class MyMath {
    public static double add(double d1, double d2) { // 进行加法计算
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.add(b2).doubleValue();
    }

    public static double sub(double d1, double d2) { // 进行减法计算
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.subtract(b2).doubleValue();
    }

    public static double mul(double d1, double d2) { // 进行乘法计算
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.multiply(b2).doubleValue();
    }

    public static double div(double d1, double d2, int len) { // 进行除法计算
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double round(double d, int len) { // 进行四舍五入
        BigDecimal b1 = new BigDecimal(d);
        BigDecimal b2 = new BigDecimal(1); // 技巧
        return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
