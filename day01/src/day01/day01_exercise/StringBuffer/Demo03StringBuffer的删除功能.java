package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer��ɾ������:
		
		1.public StringBuff deleteCharAt(int index): ɾ��ָ��λ��λ�õ��ַ�,�����ر���

		2.public StringBuff delete(int start,int end): ɾ����ָ��λ�ÿ�ʼ��λ�ý���������,�����ر���

*/
class Demo03StringBuff {
	public static void main(String[] args) {
		//����һ��StringBuffer����sb
		StringBuffer sb = new StringBuffer();

		//����public StringBuff deleteCharAt(int index): ɾ��ָ��λ��λ�õ��ַ�,�����ر���
		//sb.deleteCharAt(5);	//�������������������û��Ԫ�ص�ʱ��ᱨ java.lang.StringIndexOutOfBoundsException����

		//��Sb�������
		sb.append("heima");

		//ɾ��Ԫ��
		sb.deleteCharAt(4);
		System.out.println(sb);	//heim

		//����public StringBuff delete(int start,int end): ɾ����ָ��λ�ÿ�ʼ��λ�ý���������,�����ر���
		sb.delete(0,2);
		System.out.println(sb);//im

		sb = new StringBuffer();//��Ҫ�����ַ�ʽ��ջ�����,ԭ���Ļ�������,�˷��ڴ�
		System.out.println(sb);

		//���������
		sb.delete(0,sb.length());
		System.out.println(sb);	//��ջ�����
	}
}
