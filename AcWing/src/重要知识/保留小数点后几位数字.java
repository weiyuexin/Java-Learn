package 重要知识;

import java.math.BigDecimal;//用于大的小数计算，要求精度时可以使用
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class 保留小数点后几位数字 {

	double d = 123424.234324;
	public void f1() {
		BigDecimal bg = new BigDecimal(d);
		double d1 = bg.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(d1);
	}
	/*
	 * DecimalFormat转换最简便
	 */
	public void f2() {
		DecimalFormat df = new DecimalFormat("#.0000");
		System.out.println(df.format(d));
	}
	/*
	 * String.format打印最简便
	 */
	public void f3() {
		System.out.println(String.format("%.4f",d));
	}
    public void f4() {
    	NumberFormat nf = NumberFormat.getNumberInstance();
    	nf.setMaximumFractionDigits(4);  //设置最大精度为4
    	System.out.println(nf.format(d));
    }
	
	
	
	public static void main(String[] args) {
		保留小数点后几位数字 d = new 保留小数点后几位数字();
		d.f1();
		d.f2();
		d.f3();
		d.f4();
	}
}
