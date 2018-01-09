package work.me.demo.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DataInputHandle {
   private ArrayList<Student> list = new ArrayList<Student>();
   //read student data from file
   public void readData(){
	   Scanner scanner = null;
	   try{
		   File file = new File("list.txt");
	       scanner = new Scanner(file);
	       while(scanner.hasNext()){
	    	   long studentID = scanner.nextLong();
	    	   String name = scanner.next();
	    	   String sex = scanner.next();
	    	   Student student = new Student(studentID,name,sex);
	    	   list.add(student);
	       }
	       scanner.close();
	   }catch(Exception e){
		   System.out.println(e.toString());
		   
	   }
   }
   
   //使用objectoutputstream将对象写出到文件
   public void flattenStudent(){
	   FileOutputStream fos = null;
	   ObjectOutputStream objos = null;
       try{
    	   fos = new FileOutputStream("student.bin");
           objos = new ObjectOutputStream(fos);
           for(int i = 0;i<list.size();i++){
        	   objos.writeObject(list.get(i));
           }
           fos.close();
           objos.close();
       }catch(IOException e){
    	   e.printStackTrace();
       }
   }
   //从文件读取对象
   public void inflateStudent(){
	   FileInputStream fis = null;
	   ObjectInputStream objis = null;
	   try{
		   fis = new FileInputStream("C:\\Users\\25116\\Desktop\\JAVA程序设计\\JavaProject\\JavaObjectSerialization\\student.bin");
		   objis = new ObjectInputStream(fis);
		   while(true){
			   Student student = (Student) objis.readObject();
			   System.out.println(student);
			   
		   }
	   }catch(IOException e){
		   e.printStackTrace();
	   }catch (ClassNotFoundException e) {
		// TODO: handle exception
		   e.printStackTrace();
	}
   }
   
   
}
