package ��Ҫ֪ʶ;

import java.math.BigDecimal;//���ڴ��С�����㣬Ҫ�󾫶�ʱ����ʹ��
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ����С�����λ���� {

	double d = 123424.234324;
	public void f1() {
		BigDecimal bg = new BigDecimal(d);
		double d1 = bg.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(d1);
	}
	/*
	 * DecimalFormatת������
	 */
	public void f2() {
		DecimalFormat df = new DecimalFormat("#.0000");
		System.out.println(df.format(d));
	}
	/*
	 * String.format��ӡ����
	 */
	public void f3() {
		System.out.println(String.format("%.4f",d));
	}
    public void f4() {
    	NumberFormat nf = NumberFormat.getNumberInstance();
    	nf.setMaximumFractionDigits(4);  //������󾫶�Ϊ4
    	System.out.println(nf.format(d));
    }
	
	
	
	public static void main(String[] args) {
		����С�����λ���� d = new ����С�����λ����();
		d.f1();
		d.f2();
		d.f3();
		d.f4();
	}
}
