package weiyuexin;

public class intת��ΪString {

	public static void main(String[] args) {
		int x = 12345;
		String str = String.valueOf(x);  //��int���͵���xת��ΪString����
		char ch[] = str.toCharArray();  //��Stringת��Ϊ�ַ�����
		System.out.println(str);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
