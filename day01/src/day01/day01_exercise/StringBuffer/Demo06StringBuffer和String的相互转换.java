package day01.day01_exercise.StringBuffer;

/*
	A:String----->Day01.StringBuffer
		
		1.通过构造方法

		2.通过append()方法

	B:Day01.StringBuffer------> String

	1.通过构造方法

	2.通过toString方法

	3.通过substring(0,length);
*/
class Demo06StringBufferStringReturn {
	public static void main(String[] args) {
		//A:String----->Day01.StringBuffer
		//1.通过构造方法
		StringBuffer sb = new StringBuffer("heima");
		System.out.println(sb);
		//2.通过append()方法
		StringBuffer sb1 = new StringBuffer();
		sb1.append("woaiheima");
		System.out.println(sb1);

		System.out.println("===========================");
//B:Day01.StringBuffer------> String

	//1.通过构造方法
	StringBuffer sb2 = new StringBuffer("heima");
	String str = new String(sb2);
	System.out.println(str);//"heima"

	//2.通过toString方法
		StringBuffer sb3 = new StringBuffer("woaiheimaa");
		String str1 = sb3.toString();
		System.out.println(str1);
	//3.通过subString(0,length);
		StringBuffer sb4 = new StringBuffer("黑马");
		String str2 = sb4.substring(0,sb4.length());
		System.out.println(sb4);
	}
}
