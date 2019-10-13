package matrix;

import java.util.Date;

public class SingleThreadMatrix {
	 static int[][] matrix1;
	 static int[][] matrix2;
	 static int[][] matrix3;
	 static int x;
	 static int y;
	 static int z;
	 
	 public static void main(String[] args) {
		 x=4000;
		 y=4000;
		 z=4000;
		 matrix1=new int[x][z];
		 matrix2=new int[z][y];
		 matrix3=new int[x][y];
		 Random(matrix1);
		 Random(matrix2);
		 long startTime1=new Date().getTime();
		 for(int i=0;i<x;i++) {
			 
			 for(int j=0;j<y;j++) {
				 for(int k=0;k<z;k++) {
					 matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
				 }
			 }
		 }
		 long endTime1=new Date().getTime();
		 System.out.println("1000阶循环总共用时"+(endTime1-startTime1)+"毫秒");
	
	
	 }
	 public static void Random(int[][] w) {
		 for(int i=0;i<w.length;i++) {
			 for(int j=0;j<w[i].length;j++) {
				 //生成随机100之内的数字
				 w[i][j]=2;
			 }
		 }
	 }
}
