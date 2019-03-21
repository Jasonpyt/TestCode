package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer的构造方法:

		1.public Day01.StringBuffer():无参构造方法
		
		2.public Day01.StringBuffer(int capacity):指定容量的字符串缓冲区对象

		3.public Day01.StringBuffer(String str):指定字符串内容的字符串缓冲区对象

	B:StringBuffer的方法:
		
		1.public int capacity :返回当前容量 (理论值)

		2.public int length() :返回长度(字符数) 实际值
*/
class Demo01StringBuffer {

	public static void main(String[] args) {

		//利用无参构造方法创建一个StringBuffer对象sb
		StringBuffer sb = new StringBuffer();

		//输出容器中的字符个数,实际值
		System.out.println(sb.length());	//0

		//输出容器的初始容量,理论值
		System.out.println(sb.capacity());	//16

		System.out.println("====================");

		//利用指定容量的字符串缓冲区对象的构造方法创建StringBuffer对象sb1
		StringBuffer sb1 = new StringBuffer(10);

		//输出容器中的字符个数,实际值
		System.out.println(sb1.length());	//0

		//输出容器中的初始容量,理论值
		System.out.println(sb1.capacity());	//10

		System.out.println("============================");

		//利用指定字符串内容的字符串缓冲区对象的构造方法创建StringBuffer对象sb2
		StringBuffer sb2 = new StringBuffer("heima");

		//输出容器中的字符个数,实际值
		System.out.println(sb2.length());	//5

		//输出容器中的初始容量,理论值
		System.out.println(sb2.capacity());	//21(字符串.length() + 初始容量)

	}
}
