import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ioTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 /**
		  * ����������ַ����浽�ַ�����
		  */
          System.out.println("-----�Ӽ��̽����ֽ������뵽src�ļ��еġ�txt�ļ�------");
          System.out.println("������:");
          Scanner sc = new Scanner(System.in);
          String name = sc.next();
          
          System.out.println("������"+name);
          /**
           * ���ַ��浽ָ��·���µ�txt�ļ�
           */
          String pathString = "C:\\Users\\25116\\Desktop\\JAVA�������\\JavaProject\\IO\\src\\src.txt";
	      File file = new File(pathString);
	      if(!file.getParentFile().exists()){
	    	  file.getParentFile().mkdirs();
	      }
	      try{
	    	  file.createNewFile();
	      }catch(IOException e){
	    	  e.printStackTrace();
	      }
	      try{
	    	  FileWriter fw=new FileWriter(file,true);
	    	  BufferedWriter bw=new BufferedWriter(fw);
	    	  bw.write(name);
	    	 
	    	  bw.flush();
	    	  bw.close();
	    	  fw.close();
	      }catch(IOException e){
	    	  e.printStackTrace();
	      }
	      /**
	       * ��src.txt�ļ����ݸ��Ƶ���ǰĿ¼��dest.txt�ļ���

	       */
	       String pathString2 = "C:\\Users\\25116\\Desktop\\JAVA�������\\JavaProject\\IO\\src\\dest.txt";
	       try{
	    	   BufferedReader read =new BufferedReader(new FileReader(new File(pathString)));
	           FileWriter write = new FileWriter(new File(pathString2),true);
	          String temp;
	          while((temp = read.readLine())!=null){
	        	  write.write(temp);
	          }
	          write.close();
	          read.close();
	          System.out.println("�����Ѵ�"+pathString+"���Ƶ�"+pathString2);
	       }catch(IOException e){
	    	   e.printStackTrace();
	    	   
	       }
	       /**
	        * ��dest��txt�����������ʾ����Ļ��
	        */
	       try{
	    	   FileReader fr =new FileReader(file);
	    	   BufferedReader bReader=new BufferedReader(fr);
	    	   String string = bReader.readLine();
	    	   System.out.println("��dest.txt�ļ���������ʾ������������");
	    	   System.out.println(string);
	       }catch(FileNotFoundException e){
	    	   e.printStackTrace();
	       }
	}

}
