package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer����ӹ���:
		
		1.public Day01.StringBuffer append(String str): ���԰���������������ӵ��ַ�������������,�������ַ�������������

		2.public Day01.StringBuffer insert(int offset,String str): ��ָ��λ�ð��������͵����ݲ��뵽�ַ���������������,�������ַ�������������

		3.StringBuffer���ַ���������,��new��ʱ�����ڶ��ڴ洴����һ������,�ײ���һ������Ϊ16���ַ�������
		  ��������ӵķ���ʱ,���������´�������,�ڲ�����ԭ����������ַ�
*/
class Demo02StringBuffer {
	public static void main(String[] args) {
		//����StringBuffer�Ŀղι��췽������sb����
		StringBuffer sb = new StringBuffer();

		//��sb���������(��������������͵�����)
		StringBuffer sb2 = sb.append(true);
		System.out.println(sb2.toString());//true
		StringBuffer sb3 = sb.append("heima");
		System.out.println(sb3.toString());//trueheima
		StringBuffer sb4 = sb.append(100);
		System.out.println(sb4.toString());//trueheima100
		StringBuffer sb5 = sb.append("����");
		System.out.println(sb5.toString());//trueheima100����
		System.out.println("=================================");

		//��ӡ��Ӻ���ַ���������
		System.out.println(sb);	//tureheima100����
		System.out.println(sb2);//trueheima100����
		System.out.println(sb3);//trueheima100����
		System.out.println(sb4);//trueheima100����
		System.out.println(sb5);//trueheima100����
		System.out.println("======================");

		//����һ��StringBuffer����sb2
		StringBuffer sb6 = new StringBuffer("1234");

		//����public Day01.StringBuffer insert(int offset,String str)�������

		sb6.insert(3,"����");	//�����ʼ��StringBuffer����û�����ݵĻ�ʹ��insert�������������:ava.lang.StringIndexOutOfBoundsException,���ҳ�ʼ���ַ��������������ʱ��Ҫ����ַ������͵�����
		System.out.println(sb6);//123����4

	}
}
