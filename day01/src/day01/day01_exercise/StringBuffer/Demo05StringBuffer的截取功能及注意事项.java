package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer的截取功能:

		1.public String substring(int start): 从指定位置截取到末尾

		2.public String substring(int start,int end): 截取从指定位置开始到结束为止,包括开始位置,不包括结束位置

	B:注意:返回值不再是StringBuffer本身
*/
class  Demo05StringBufferNotice {
	public static void main(String[] args) 
	{
		//创建一个StringBuffer对象
		StringBuffer sb = new StringBuffer("heima");

		//利用1.public String substring(int start): 从指定位置截取到末尾
		String sb1 = sb.substring(3);
		System.out.println(sb1);	//ma

		//利用public String substring(int start,int end): 截取从指定位置开始到结束为止,包括开始位置,不包括结束位置
		String sb2 = sb.substring(1,3);
		System.out.println(sb2);//ei
	}
}
