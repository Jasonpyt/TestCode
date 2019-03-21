package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer的添加功能:
		
		1.public Day01.StringBuffer append(String str): 可以把任意数据类型添加到字符串缓冲区里面,并返回字符串缓冲区本身

		2.public Day01.StringBuffer insert(int offset,String str): 再指定位置把任意类型的数据插入到字符串缓冲区域里面,并返回字符串缓冲区本身

		3.StringBuffer是字符串缓冲区,当new的时候是在堆内存创建了一个对象,底层是一个长度为16的字符串数组
		  当调用添加的方法时,不会再重新创建对象,在不断向原缓冲区添加字符
*/
class Demo02StringBuffer {
	public static void main(String[] args) {
		//利用StringBuffer的空参构造方法创建sb对象
		StringBuffer sb = new StringBuffer();

		//向sb中添加数据(可以添加任意类型的数据)
		StringBuffer sb2 = sb.append(true);
		System.out.println(sb2.toString());//true
		StringBuffer sb3 = sb.append("heima");
		System.out.println(sb3.toString());//trueheima
		StringBuffer sb4 = sb.append(100);
		System.out.println(sb4.toString());//trueheima100
		StringBuffer sb5 = sb.append("黑马");
		System.out.println(sb5.toString());//trueheima100黑马
		System.out.println("=================================");

		//打印添加后的字符串缓冲区
		System.out.println(sb);	//tureheima100黑马
		System.out.println(sb2);//trueheima100黑马
		System.out.println(sb3);//trueheima100黑马
		System.out.println(sb4);//trueheima100黑马
		System.out.println(sb5);//trueheima100黑马
		System.out.println("======================");

		//创建一个StringBuffer对象sb2
		StringBuffer sb6 = new StringBuffer("1234");

		//利用public Day01.StringBuffer insert(int offset,String str)添加数据

		sb6.insert(3,"黑马");	//如果初始化StringBuffer对象没有数据的话使用insert方法会产生错误:ava.lang.StringIndexOutOfBoundsException,而且初始化字符串缓冲区对象的时候要添加字符串类型的数据
		System.out.println(sb6);//123黑马4

	}
}
