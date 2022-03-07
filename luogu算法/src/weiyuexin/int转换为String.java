package weiyuexin;

public class int转换为String {

	public static void main(String[] args) {
		int x = 12345;
		String str = String.valueOf(x);  //将int类型的数x转换为String类型
		char ch[] = str.toCharArray();  //将String转换为字符数组
		System.out.println(str);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
