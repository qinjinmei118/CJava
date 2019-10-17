package matrix;

import java.util.Date;

public class MultiThreadMatrix {
	static int[][] matrix1;
	static int[][] matrix2;
	static int[][] matrix3;
	static int x,y,z;
	static int index;
	static int threadCount;
	public static void main(String[] args) throws InterruptedException {
		 x=5000;
		 y=5000;
		 z=5000;
		 matrix1=new int[x][z];
		 matrix2=new int[z][y];
		 matrix3=new int[x][y];
		 Random(matrix1);
		 Random(matrix2);
		 long startTime=new Date().getTime();
		 //�����̣߳�������=4
		 for(int i=0;i<10;i++) {
			 if(index<x) {
				 Thread t=new Thread(new MyThread());
				 t.start();
			 }
			 else
			 {
				 break;
			 }
		 }
		 //�ȴ����������
		 while(threadCount!=0) {
			 Thread.sleep(20);
		 }
		 long endTime=new Date().getTime();
		 System.out.println("1000��ѭ���ܹ���ʱ"+(endTime-startTime)+"����");
	}
	 public static void Random(int[][] w) {
		 for(int i=0;i<w.length;i++) {
			 for(int j=0;j<w[i].length;j++) {
				 //�������100֮�ڵ�����
				 w[i][j]=(int) (Math.random()*10);
			 }
		 }
	 }
	 
	 synchronized static int getTask() {
		 if(index<x) {
			 return index++;
		 }
		 return -1;
	 }
}
class MyThread implements Runnable
{
	int tt;
	@Override
	public void run() {
		MultiThreadMatrix.threadCount++;
		while((tt=MultiThreadMatrix.getTask())!=-1) {
			System.out.println("����"+Thread.currentThread().getName()+"\t��ʼ�����"+(tt+1)+"��");
			for(int i=0;i<MultiThreadMatrix.y;i++) {
				for(int j=0;j<MultiThreadMatrix.z;j++) {
					MultiThreadMatrix.matrix3[tt][i]+=MultiThreadMatrix.matrix1[tt][j]*MultiThreadMatrix.matrix2[j][i];
				}
			}
		}
		MultiThreadMatrix.threadCount--;
	}
	
}
