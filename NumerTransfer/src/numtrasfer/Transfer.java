package numtrasfer;

public class Transfer {
	
	public static void transfer(int num,int base,int offset)
	{   
		int number = num;
		char[] table = new char[]{'0','1','2','3',
                                  '4','5','6','7',
                                  '8','9','A','B',
                                  'C','D','E','F'};
		char arr[] = new char[32];
		int pos = arr.length;
		while(num!=0)
		{
			int temp = num & base;
			arr[--pos] = table[temp];
			num = num >>> offset;
		}
		System.out.print(number+"的");
		System.out.println(base+1+"进制转换的结果是");
		for(int i=pos; i<arr.length;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	/*
	 * 十进制转2进制
	 * */
	public void toBin(int num)
	{
		transfer(num,1,1);
	}
	
	/*
	 * 十进制转8进制
	 * */
	public void toOctal(int num)
	{
		transfer(num,7,3);
	}
	
	/*
	 * 十进制转16进制
	 * */
	public void toHex(int num)
	{
		transfer(num,15,4);
	}

}
