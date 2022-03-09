package ��Ҫ֪ʶ;

import java.math.BigDecimal;  //����BigDecimal���ڸ߾�������
import java.math.BigInteger;  //����math���е�BigInteger��
import java.util.*;

public class Java�������� {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//BigInteger����������
		BigInteger b1 = new BigInteger("1231243244124412");  //��һ�ֳ�ʼ���������������ַ���
	    BigInteger b2 = BigInteger.valueOf(123124234);  //�ڶ��ֳ�ʼ������������������int��long
	    System.out.println("�ӷ�������"+b2.add(b1));  //�ӷ�
        System.out.println("����������"+b2.subtract(b1));  //����
        System.out.println("�˷�������"+b2.multiply(b1));  //�˷�
        System.out.println("����������"+b2.divide(b1)); //����
        System.out.println("�������"+b2.max(b1));//���ֵ
        System.out.println("��С����"+b2.min(b1)); //��Сֵ
        BigInteger result[]=b2.divideAndRemainder(b1);  //�̺�����
        System.out.println("���ǣ�"+result[0]+" "+"�����ǣ�"+result[1]);
        
        System.out.println("-------------------------------------");
        
        
        //BigDecimal����С���ĸ߾�������
        System.out.println("�ӷ����㣺" + MyMath.round(MyMath.add(10.345, 3.333), 1));
        System.out.println("�������㣺" + MyMath.round(MyMath.sub(10.345, 3.333), 3));
        System.out.println("�˷����㣺" + MyMath.round(MyMath.mul(10.345, 3.333), 4));
        System.out.println("�������㣺" + MyMath.div(10.345, 3.333, 3));
	}

}
class MyMath {
    public static double add(double d1, double d2) { // ���мӷ�����
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.add(b2).doubleValue();
    }

    public static double sub(double d1, double d2) { // ���м�������
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.subtract(b2).doubleValue();
    }

    public static double mul(double d1, double d2) { // ���г˷�����
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.multiply(b2).doubleValue();
    }

    public static double div(double d1, double d2, int len) { // ���г�������
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double round(double d, int len) { // ������������
        BigDecimal b1 = new BigDecimal(d);
        BigDecimal b2 = new BigDecimal(1); // ����
        return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
