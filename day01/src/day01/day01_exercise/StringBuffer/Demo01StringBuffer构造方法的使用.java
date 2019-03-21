package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer�Ĺ��췽��:

		1.public Day01.StringBuffer():�޲ι��췽��
		
		2.public Day01.StringBuffer(int capacity):ָ���������ַ�������������

		3.public Day01.StringBuffer(String str):ָ���ַ������ݵ��ַ�������������

	B:StringBuffer�ķ���:
		
		1.public int capacity :���ص�ǰ���� (����ֵ)

		2.public int length() :���س���(�ַ���) ʵ��ֵ
*/
class Demo01StringBuffer {

	public static void main(String[] args) {

		//�����޲ι��췽������һ��StringBuffer����sb
		StringBuffer sb = new StringBuffer();

		//��������е��ַ�����,ʵ��ֵ
		System.out.println(sb.length());	//0

		//��������ĳ�ʼ����,����ֵ
		System.out.println(sb.capacity());	//16

		System.out.println("====================");

		//����ָ���������ַ�������������Ĺ��췽������StringBuffer����sb1
		StringBuffer sb1 = new StringBuffer(10);

		//��������е��ַ�����,ʵ��ֵ
		System.out.println(sb1.length());	//0

		//��������еĳ�ʼ����,����ֵ
		System.out.println(sb1.capacity());	//10

		System.out.println("============================");

		//����ָ���ַ������ݵ��ַ�������������Ĺ��췽������StringBuffer����sb2
		StringBuffer sb2 = new StringBuffer("heima");

		//��������е��ַ�����,ʵ��ֵ
		System.out.println(sb2.length());	//5

		//��������еĳ�ʼ����,����ֵ
		System.out.println(sb2.capacity());	//21(�ַ���.length() + ��ʼ����)

	}
}
