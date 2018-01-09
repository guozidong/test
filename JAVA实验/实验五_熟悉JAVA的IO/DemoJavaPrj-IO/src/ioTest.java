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
		  * 键盘输入的字符保存到字符变量
		  */
          System.out.println("-----从键盘接收字节流存入到src文件夹的。txt文件------");
          System.out.println("请输入:");
          Scanner sc = new Scanner(System.in);
          String name = sc.next();
          
          System.out.println("姓名："+name);
          /**
           * 将字符存到指定路径下的txt文件
           */
          String pathString = "C:\\Users\\25116\\Desktop\\JAVA程序设计\\JavaProject\\IO\\src\\src.txt";
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
	       * 将src.txt文件内容复制到当前目录下dest.txt文件中

	       */
	       String pathString2 = "C:\\Users\\25116\\Desktop\\JAVA程序设计\\JavaProject\\IO\\src\\dest.txt";
	       try{
	    	   BufferedReader read =new BufferedReader(new FileReader(new File(pathString)));
	           FileWriter write = new FileWriter(new File(pathString2),true);
	          String temp;
	          while((temp = read.readLine())!=null){
	        	  write.write(temp);
	          }
	          write.close();
	          read.close();
	          System.out.println("内容已从"+pathString+"复制到"+pathString2);
	       }catch(IOException e){
	    	   e.printStackTrace();
	    	   
	       }
	       /**
	        * 将dest。txt里面的内容显示在屏幕上
	        */
	       try{
	    	   FileReader fr =new FileReader(file);
	    	   BufferedReader bReader=new BufferedReader(fr);
	    	   String string = bReader.readLine();
	    	   System.out.println("将dest.txt文件的内容显示。。。。。。");
	    	   System.out.println(string);
	       }catch(FileNotFoundException e){
	    	   e.printStackTrace();
	       }
	}

}
