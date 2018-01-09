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
	private File file = new File(catalog);//�������·��
	private String name = file.getName();//��ȡ�ļ�����
	private String absPath = file.getAbsolutePath();//��ȡ�ļ�·�����Ǿ���·��
	private String path = file.getPath();//��ȡ�ļ������·��
	private long useSpace = file.getUsableSpace();
	private long time = file.lastModified();//��ȡ�ļ��޸�����
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
		System.out.println("�г���Ŀ¼�µ������ļ��У�");
		for(File temp:file.listFiles()){
			Date fileDate = new Date(temp.lastModified());
			if(temp.isDirectory()){
				System.out.println(temp.toString());
				System.out.println("�޸�ʱ��:"+fileDate);
				System.out.println("��С:"+temp.getUsableSpace()+"�ֽ�");
				System.out.println("---------------------------------");
			}
			
		}
		System.out.println("�г���Ŀ¼�µ������ļ�����Ϣ:");
		for(File temp:file.listFiles()){
			Date fileDate = new Date(temp.lastModified());
			if(temp.isFile()){
				System.out.println(temp.toString());
				System.out.println("�޸�ʱ��:"+fileDate);
				System.out.println("��С:"+temp.getUsableSpace()+"�ֽ�");
				System.out.println("---------------------------------");
			}
		}
		
	}
	public void printTxt(){
		
	}
	
}
