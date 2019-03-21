package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer的删除功能:
		
		1.public StringBuff deleteCharAt(int index): 删除指定位置位置的字符,并返回本身

		2.public StringBuff delete(int start,int end): 删除从指定位置开始定位置结束的内容,并返回本身

*/
class Demo03StringBuff {
	public static void main(String[] args) {
		//创建一个StringBuffer对象sb
		StringBuffer sb = new StringBuffer();

		//利用public StringBuff deleteCharAt(int index): 删除指定位置位置的字符,并返回本身
		//sb.deleteCharAt(5);	//当缓冲区中这个索引上没有元素的时候会报 java.lang.StringIndexOutOfBoundsException错误

		//给Sb添加数据
		sb.append("heima");

		//删除元素
		sb.deleteCharAt(4);
		System.out.println(sb);	//heim

		//利用public StringBuff delete(int start,int end): 删除从指定位置开始定位置结束的内容,并返回本身
		sb.delete(0,2);
		System.out.println(sb);//im

		sb = new StringBuffer();//不要用这种方式清空缓冲区,原来的会变成垃圾,浪费内存
		System.out.println(sb);

		//清楚缓冲区
		sb.delete(0,sb.length());
		System.out.println(sb);	//清空缓冲区
	}
}
