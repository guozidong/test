import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.Writer;

import javax.management.RuntimeErrorException;
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /**
          * 首先不用缓冲复制文件
          */
		
		 System.out.println("不使用缓冲区，开始复制文件。。。。。。。。。。。");
		 long startTime = System.currentTimeMillis();
		 FileInputStream fis = null;
		 FileOutputStream fos = null;
		 try{
			 fis = new FileInputStream("C:\\Users\\25116\\Desktop\\JAVA程序设计\\JavaProject\\BufferAndNobuffer\\1.txt");
             fos = new FileOutputStream("C:\\Users\\25116\\Desktop\\JAVA程序设计\\JavaProject\\BufferAndNobuffer\\2.txt");
             byte[] buf = new byte[1024];
             int len = 0;
             while((len = fis.read(buf))!=-1){
            	 fos.write(buf,0,len);
             }
		 }catch(IOException e){
			 throw new RuntimeException("文件复制失败!");
		 }finally{
			 try{
				 if(fis !=null)
					 fis.close();
			 }catch(IOException e){
				 throw new RuntimeException("读取关闭失败!");
			 }
			 try{
				 if(fos!=null)
					 fos.close();
			 }catch(IOException e){
				 throw new RuntimeException("写入关闭失败!");
			 }
		 }
		 long endTime = System.currentTimeMillis();
		 System.out.println("程序运行时间:"+(endTime-startTime)+"ms");
		 /**
		  * 接下来使用缓冲对文件进行复制
		  */
		  System.out.println("使用缓冲区开始复制文件............");
		  long startTime2  = System.currentTimeMillis();
		  BufferedInputStream bufis = null;
		  BufferedOutputStream bufos = null;
		  try{
			  bufis = new BufferedInputStream(new FileInputStream("C:\\Users\\25116\\Desktop\\JAVA程序设计\\JavaProject\\BufferAndNobuffer\\3.txt"));
		      bufos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\25116\\Desktop\\JAVA程序设计\\JavaProject\\BufferAndNobuffer\\4.txt"));
		      int byt = 0;
			  while((byt = bufis.read())!=-1){
				  bufos.write(byt);
			  }
		  }catch(IOException e){
			  
			  throw new RuntimeException("文件复制失败!");
		  }finally{
			  try{
				  if(bufis != null)
					  bufis.close();
			  }catch(IOException e){
				  throw new RuntimeException("读取关闭失败!");
			  }
			  try{
				  if(bufos !=null)
					  bufos.close();
			  }catch(IOException e){
				  throw new RuntimeException("写入关闭失败!");
			  }
		  }
		  long endTime2 = System.currentTimeMillis();
		  System.out.println("程序运行时间:"+(endTime2-startTime2)+"ms");
	}

}
