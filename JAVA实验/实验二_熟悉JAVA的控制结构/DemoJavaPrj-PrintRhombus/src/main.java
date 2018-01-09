

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int lay;
	        lay = 7;//菱形的总长度
	        for(int m = 1; m <=(lay+1)/2; m++)//正序输出上半部分
	        {
	            for(int b = 1; b <=(lay+1)/2-m ; b++)//输出空格
	            {
	                System.out.print(" ");
	            }
	            for(int c = 1; c <= m*2-1; c++)
	            {
	                System.out.print("*");    
	            }
	            System.out.println();//换行
	        }
	        for(int d =(lay+1)/2-1;d >= 1; d --)//倒序输出下半部分
	        {
	            for(int b = 1; b <= (lay+1)/2-d; b++)//输出空格
	            {
	                System.out.print(" ");
	            }
	            for(int c = (lay+1)/2-d; c <=(lay+1)/2-2+d; c ++)//(lay+1)/2-1即为下半个三角形
	            {
	                System.out.print("*");    
	            }
	            System.out.println();
	        }
	        
	    }

    	
}
    



