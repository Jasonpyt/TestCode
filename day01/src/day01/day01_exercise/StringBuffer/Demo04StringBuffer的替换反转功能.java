package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer���滻����:

		public Day01.StringBuffer replace(int start,int end,String str);

	B:StringBuffer�ķ�ת����:

		public Day01.StringBuffer reverse(): �ַ�����ת
*/
class Demo04StringBuffer{
	public static void main(String[] args) {
		//StringBuffer���滻����:public Day01.StringBuffer replace(int start,int end,String str);

		StringBuffer sb = new StringBuffer("������");

		sb.replace(0,2,"����");
		System.out.println(sb);//������

		System.out.println("============================");

		//StringBuffer�ķ�ת����:
		//public Day01.StringBuffer reverse(): �ַ�����ת
		sb.reverse();
		System.out.println(sb);//"�����"

	}
}
