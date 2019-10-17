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
			poolThreads[i]=new Thread(new workThread(i,matrix1,matrix2,matrix3));		//�����̳߳�		
		ExecutorService pool = Executors.newCachedThreadPool();		
		long time5=System.currentTimeMillis();//��¼��ʼʱ��		
		for(int i=0;i<NUM_THREADS;i++)			
			pool.execute(poolThreads[i]);	
		pool.shutdown();
		while (true) {             
			if (pool.isTerminated()) {                  
				break;             
				}       
			}//��һ����ѭ���ж��̳߳��Ƿ�ִ�����		
		long time6=System.currentTimeMillis();//��¼����ʱ��		
		System.out.println("����["+M+","+K+"]��["+K+","+N+"]�׾���˷�,�̳߳ؼ�����ʱ:"+(time6-time5)+"����");			
		
	
	}
	public threadPool(){		
		matrix1=new int[M][K];		
		matrix2=new int[K][N];		
		matrix3=new int[M][N];//A��B��C��ʼ��		
		fillRandom(matrix1);//��0-99���������ʼ������A		
		fillRandom(matrix2);//��0-99���������ʼ������B		
		for(int i=0;i<M;i++)			
			for(int j=0;j<N;j++)				
				matrix3[i][j]=0;//��C����ȫ����			
		}

	private void fillRandom(int[][] A) {		
		for(int i=0;i<A.length;i++){			
			for(int j=0;j<A[i].length;j++)				
				A[i][j]=(int)(Math.random()*10);		
			}	
		}
	
}
