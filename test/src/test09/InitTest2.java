
package test09;

public class InitTest2 {
	String str = "abc";

	public static void main(String[] args) {
		InitTest it = new InitTest();
		InitTest2 it2 = new InitTest2();
		System.out.println(it.str == it2.str);
		String str = new String("abc");
		System.out.println(str.equals( it2.str));

	}

}