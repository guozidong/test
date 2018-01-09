package getFileTree;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
public class getFile{
	Scanner scanner = new Scanner(System.in);
	String catalog = scanner.nextLine();
	private File file = new File(catalog);//这是相对路径
	private String name = file.getName();//获取文件名称
	private String absPath = file.getAbsolutePath();//获取文件路径，是绝对路径
	private String path = file.getPath();//获取文件的相对路径
	private long useSpace = file.getUsableSpace();
	private long time = file.lastModified();//获取文件修改日期
    private Date date = new Date(time);
	private DateFormat dateFormat =DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
	private String strTime = dateFormat.format(date);
    
	public String getParent(){
		return file.getParent(); 
	}
	
	public String getName(){
		return name;
	}
	
	public String getAbsPath(){
		return absPath;
	}
	
	public String getpath(){
		return path;
	}
	public long getUseSpace(){
		return file.getUsableSpace();
	}
	public long getTime(){
		return time;
	}
	public String strTime(){
		return strTime;
	}
	public void print(){
    	 System.out.println("parent:"+file.getParent());
    	 System.out.println("name:"+name);
    	 System.out.println("absPath:"+absPath);
    	 System.out.println("path:"+path);
    	 System.out.println("useSpace:"+useSpace);
    	 System.out.println("time:"+time);
    	 System.out.println("strTime:"+strTime);
	}
	public void printFolderFile(){
		System.out.println("列出该目录下的所有文件夹：");
		for(File temp:file.listFiles()){
			Date fileDate = new Date(temp.lastModified());
			if(temp.isDirectory()){
				System.out.println(temp.toString());
				System.out.println("修改时间:"+fileDate);
				System.out.println("大小:"+temp.getUsableSpace()+"字节");
				System.out.println("---------------------------------");
			}
			
		}
		System.out.println("列出该目录下的所有文件的信息:");
		for(File temp:file.listFiles()){
			Date fileDate = new Date(temp.lastModified());
			if(temp.isFile()){
				System.out.println(temp.toString());
				System.out.println("修改时间:"+fileDate);
				System.out.println("大小:"+temp.getUsableSpace()+"字节");
				System.out.println("---------------------------------");
			}
		}
		
	}
	public void printTxt(){
		
	}
	
}
