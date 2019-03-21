package day01.day01_exercise.StringBuffer;

import java.util.Scanner;

/*
* A: ����:
*           ���ַ�����ת
*           ����:����¼��"abc"
*           ������"cba"
* */
public class Demo08StringBufferStringReversal{
    public static void main(String[] args) {
    //��������¼�����
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ��Ҫ��ת���ַ�: ");
        String  intput = sc.nextLine();
        //����StringBuffer����sb
        StringBuffer sb = new StringBuffer(intput);
        //�������ݷ�ת����
        sb.reverse();
        //�����ת��Ľ��
        System.out.println(sb);
       
    }
}