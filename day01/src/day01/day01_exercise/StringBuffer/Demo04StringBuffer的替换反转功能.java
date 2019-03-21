package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer的替换功能:

		public Day01.StringBuffer replace(int start,int end,String str);

	B:StringBuffer的反转功能:

		public Day01.StringBuffer reverse(): 字符串反转
*/
class Demo04StringBuffer{
	public static void main(String[] args) {
		//StringBuffer的替换功能:public Day01.StringBuffer replace(int start,int end,String str);

		StringBuffer sb = new StringBuffer("黑马寺");

		sb.replace(0,2,"白马");
		System.out.println(sb);//白马寺

		System.out.println("============================");

		//StringBuffer的反转功能:
		//public Day01.StringBuffer reverse(): 字符串反转
		sb.reverse();
		System.out.println(sb);//"寺马白"

	}
}
