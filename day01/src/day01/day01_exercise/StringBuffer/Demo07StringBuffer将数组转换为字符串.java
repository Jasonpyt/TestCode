package day01.day01_exercise.StringBuffer;

class Demo07StringBuffer {
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3};
		String str = arry2String(arr);
		System.out.println(str);	//[1 , 2 , 3]
	}

	//����һ������������ת��Ϊ�ַ���
	public static String arry2String(int[] arr){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0;i <  arr.length ;i++ )
		{
			if (i == arr.length -1)
			{
				sb.append(arr[i]).append("]");
			}else{
				sb.append(arr[i]).append(", ");
			}
		}
		return sb.toString();
	}
}
