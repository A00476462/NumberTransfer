package array_Partition_1;
import java.util.Arrays;

//排序数组，复制数组
public class Solution {
	public int arrayPairSum(int[] nums) {
		//冒泡排序
		int temp;
		for(int i = 0;i<nums.length-1;i++)
		{
			for(int j=0;j<nums.length-i-1;j++)
			{
				if(nums[j]>nums[j+1])
				{
					temp =nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		for (int i=0;i<nums.length;i++)//输出显示
		System.out.println(nums[i]);
		
		System.out.println("*****************第一种复制方法*****************");
		
		int[] copyNums1=new int [nums.length];
		for(int i=0;i<nums.length;i++)
		{
			copyNums1[i]=nums[i];
		}
		for(int i=0;i<copyNums1.length;i++)
			System.out.println(copyNums1[i]);
		
		System.out.println("*******************第二复制方法****************");
		int[] copyNums2 = new int[nums.length];
		System.arraycopy(nums, 0, copyNums2, 0, nums.length);
		for(int i=0;i<copyNums2.length;i++)
			System.out.println(copyNums2[i]);
		return 0;
		
	}
	
	//将一个数组分成每个长度为2的N个数组
	public int someArray(int[] nums) {
		long SUM=0;
		int numsSum=0;
		int[][]groupArray = new int[(int) (nums.length*0.5)][2];
		for(int i=0;i<(int)(nums.length*0.5);i++)
		{
			int sum=0;
			for(int j=0;j<2;j++)
			{	
				groupArray[i][j]=nums[numsSum];
				sum++;
				numsSum++;
				
				if(sum%2==0)					
					break;
			}
		}
		
		for(int i=0;i<(int)(nums.length*0.5);i++)
		{
			int sum = 0;
			for(int j=0;j<2;j++) {
				System.out.print(groupArray[i][j]+"  ");
				sum++;
				if(sum%2==0)
					System.out.println("\n");
			}				
		}
		
		for(int i=0;i<(int)(nums.length*0.5);i++)
		{
			SUM =SUM +groupArray[i][0];
		}
		System.out.println("最终的结果是："+SUM);
		return 0;
			
	}
	
	//综合上面的两个部分的类
	public int arrayPairSum2(int[] nums) {
        /**
        第一步：排序（冒泡法）
        第二步：for循环生成N个数组
        第三步：for循环找到N个数组里小的那个数计算总和
        */
		if(nums==null)
		{
			return 0;
		}
        int SUM=0;//最终的结果
        //排序部分
        
        int temp;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
        	System.out.print(nums[i]+"  ");
        	
        }
        System.out.println();System.out.println();
        //生成N个数组部分
        int[][] groupArray=new int[(int)(nums.length*0.5)][2];
        int numsSum=0;
        for(int i=0;i<(int)(nums.length*0.5);i++)
        {
            int sum = 0;
            for(int j=0;j<2;j++){
                groupArray[i][j]=nums[numsSum];
                sum++;
                numsSum++;
                if(sum%2==0)
                    break;
            }
            
        }
        
        //取出生成数组里面小的那个数值相加
        for(int i=0;i<(int)(nums.length*0.5);i++)
        {
            SUM = SUM+groupArray[i][0];
        }
        System.out.println(SUM);
        
        return 0;
    }
	
	//简化版的方法解决类
	public int simplifySolution(int[] nums) {
		int SUM=0;
		Arrays.sort(nums);
//		for(int i=0;i<nums.length;i++)
//		{
//			System.out.print(nums[i]+"  ");
//		}
//		System.out.println("\n");//显示排序后的数组
		//此部分循环次数是最终简化版的2倍，不适合采用
//		for(int i=0;i<nums.length;i++)
//		{
//			if(i%2==0) {
//				SUM = SUM+nums[i];
//			}
//		}
		for(int i=0;i<nums.length;i=i+2)
		{
			SUM = SUM+nums[i];
		}
		System.out.println("简化版方法里的SUM=:"+SUM);
		return 0;
		
	}

	
}
