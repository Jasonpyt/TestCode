package day01.day01_exercise.StringBuffer;

/*
	A:StringBuffer�Ľ�ȡ����:

		1.public String substring(int start): ��ָ��λ�ý�ȡ��ĩβ

		2.public String substring(int start,int end): ��ȡ��ָ��λ�ÿ�ʼ������Ϊֹ,������ʼλ��,����������λ��

	B:ע��:����ֵ������StringBuffer����
*/
class  Demo05StringBufferNotice {
	public static void main(String[] args) 
	{
		//����һ��StringBuffer����
		StringBuffer sb = new StringBuffer("heima");

		//����1.public String substring(int start): ��ָ��λ�ý�ȡ��ĩβ
		String sb1 = sb.substring(3);
		System.out.println(sb1);	//ma

		//����public String substring(int start,int end): ��ȡ��ָ��λ�ÿ�ʼ������Ϊֹ,������ʼλ��,����������λ��
		String sb2 = sb.substring(1,3);
		System.out.println(sb2);//ei
	}
}
