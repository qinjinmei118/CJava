package matrix;

public class workThread implements Runnable {
		private int start;//���㿪ʼλ�ã��Դ����ֹ����̹߳�������	
		private int [][]matrix1;	
		private int [][]matrix2;	
		private int [][]matrix3;		//�����̹߳��췽��	
		public workThread(int start,int [][]matrix1,int [][]matrix2,int [][]matrix3){		
			this.start=start;		
			this.matrix1=matrix1;		
			this.matrix2=matrix2;		
			this.matrix3=matrix2;	
			}		
		@Override	
		public void run() {		
			int i,j,k;		//�����߳���������ÿ�������߳�����		
			for(i=start; i<threadPool.M; i +=threadPool.NUM_THREADS)      		
			{      			
				for(j=0;j<threadPool.N;j++)      			
				{           				
					for( k=0; k< threadPool.K;k++) {         					
						matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];         			
					}		
				}	
			} 
		}
	
	
}
