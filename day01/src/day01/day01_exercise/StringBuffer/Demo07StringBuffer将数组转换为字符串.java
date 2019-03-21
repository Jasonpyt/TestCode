package day01.day01_exercise.StringBuffer;

class Demo07StringBuffer {
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3};
		String str = arry2String(arr);
		System.out.println(str);	//[1 , 2 , 3]
	}

	//定义一个方法将数组转换为字符串
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
