package matrix;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPool {
	
	static int[][] matrix1;
	static int[][] matrix2;
	static int[][] matrix3;
	
	 
	public static final int NUM_THREADS = 2;
	public static final int M = 5000;
	public static final int N = 5000;
	public static final int K = 5000;
	public static void main(String[] args) {
		new threadPool();
		Thread []poolThreads=new Thread[NUM_THREADS];		
		for(int i=0;i<NUM_THREADS;i++)			
			poolThreads[i]=new Thread(new workThread(i,matrix1,matrix2,matrix3));		//建立线程池		
		ExecutorService pool = Executors.newCachedThreadPool();		
		long time5=System.currentTimeMillis();//记录开始时间		
		for(int i=0;i<NUM_THREADS;i++)			
			pool.execute(poolThreads[i]);	
		pool.shutdown();
		while (true) {             
			if (pool.isTerminated()) {                  
				break;             
				}       
			}//用一个死循环判断线程池是否执行完成		
		long time6=System.currentTimeMillis();//记录结束时间		
		System.out.println("计算["+M+","+K+"]与["+K+","+N+"]阶矩阵乘法,线程池计算用时:"+(time6-time5)+"毫秒");			
		
	
	}
	public threadPool(){		
		matrix1=new int[M][K];		
		matrix2=new int[K][N];		
		matrix3=new int[M][N];//A、B、C初始化		
		fillRandom(matrix1);//用0-99的随机数初始化矩阵A		
		fillRandom(matrix2);//用0-99的随机数初始化矩阵B		
		for(int i=0;i<M;i++)			
			for(int j=0;j<N;j++)				
				matrix3[i][j]=0;//将C矩阵全置零			
		}

	private void fillRandom(int[][] A) {		
		for(int i=0;i<A.length;i++){			
			for(int j=0;j<A[i].length;j++)				
				A[i][j]=(int)(Math.random()*10);		
			}	
		}
	
}
