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
          * ���Ȳ��û��帴���ļ�
          */
		
		 System.out.println("��ʹ�û���������ʼ�����ļ�����������������������");
		 long startTime = System.currentTimeMillis();
		 FileInputStream fis = null;
		 FileOutputStream fos = null;
		 try{
			 fis = new FileInputStream("C:\\Users\\25116\\Desktop\\JAVA�������\\JavaProject\\BufferAndNobuffer\\1.txt");
             fos = new FileOutputStream("C:\\Users\\25116\\Desktop\\JAVA�������\\JavaProject\\BufferAndNobuffer\\2.txt");
             byte[] buf = new byte[1024];
             int len = 0;
             while((len = fis.read(buf))!=-1){
            	 fos.write(buf,0,len);
             }
		 }catch(IOException e){
			 throw new RuntimeException("�ļ�����ʧ��!");
		 }finally{
			 try{
				 if(fis !=null)
					 fis.close();
			 }catch(IOException e){
				 throw new RuntimeException("��ȡ�ر�ʧ��!");
			 }
			 try{
				 if(fos!=null)
					 fos.close();
			 }catch(IOException e){
				 throw new RuntimeException("д��ر�ʧ��!");
			 }
		 }
		 long endTime = System.currentTimeMillis();
		 System.out.println("��������ʱ��:"+(endTime-startTime)+"ms");
		 /**
		  * ������ʹ�û�����ļ����и���
		  */
		  System.out.println("ʹ�û�������ʼ�����ļ�............");
		  long startTime2  = System.currentTimeMillis();
		  BufferedInputStream bufis = null;
		  BufferedOutputStream bufos = null;
		  try{
			  bufis = new BufferedInputStream(new FileInputStream("C:\\Users\\25116\\Desktop\\JAVA�������\\JavaProject\\BufferAndNobuffer\\3.txt"));
		      bufos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\25116\\Desktop\\JAVA�������\\JavaProject\\BufferAndNobuffer\\4.txt"));
		      int byt = 0;
			  while((byt = bufis.read())!=-1){
				  bufos.write(byt);
			  }
		  }catch(IOException e){
			  
			  throw new RuntimeException("�ļ�����ʧ��!");
		  }finally{
			  try{
				  if(bufis != null)
					  bufis.close();
			  }catch(IOException e){
				  throw new RuntimeException("��ȡ�ر�ʧ��!");
			  }
			  try{
				  if(bufos !=null)
					  bufos.close();
			  }catch(IOException e){
				  throw new RuntimeException("д��ر�ʧ��!");
			  }
		  }
		  long endTime2 = System.currentTimeMillis();
		  System.out.println("��������ʱ��:"+(endTime2-startTime2)+"ms");
	}

}
