package matrixreshape;

public class Solution {
	public int[][] matrixReshape(int[][] nums,int r,int c){
		
		int[][] newNums=new int[r][c];
        int[] oneRow=new int[r*c];
        int row = nums.length;
        int column = nums[0].length;
        //如果行列数不满足所给定的，就返回初始矩阵
        if(row*column < r*c||row*column>r*c){
            return nums;
        }
        else{
            int SUM1=0;
            int SUM2=0;
            //新生成一个一行的矩阵
            for(int i=0;i<row;i++)
                for(int j=0;j<column;j++)
                {
                    oneRow[SUM1]=nums[i][j];
                    SUM1++;
                }
            //利用一行的矩阵，生成所需要的r*c的矩阵
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    newNums[i][j]=oneRow[SUM2];
                    SUM2++;
                }
            }
        }
        return newNums;
	}
}
