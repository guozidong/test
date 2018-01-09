package edu.fjnu.Fcfs2.demo;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Random random = new Random();
	        try{
	            File writename=new File("E:\\workplace\\FCFS\\data.txt");
	            writename.createNewFile();//创建新文件
	            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
	            int[] times={6,2,1,3,9};
	            for(int i=0;i<100;i++){
	                out.write(i+1 + " "+i+" "+ times[random.nextInt(times.length)]+"\r\n");
	            }
	            out.flush();
	            out.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }

	        try{
	            File writename=new File("E:\\workplace\\FCFS\\data2.txt");
	            writename.createNewFile();//创建新文件
	            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
	            int[] times={6,2,1,3,9};
	            for(int i=0;i<100;i++){
	                out.write(i+1 + " "+i+" "+ times[random.nextInt(times.length)]+"\r\n");
	            }
	            out.flush();
	            out.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }

	        FCFS fcfs=new FCFS(1);
	        FCFS fcfs1=new FCFS(2);



	        fcfs.initialize_task("E:\\workplace\\FCFS\\data.txt");
	        fcfs1.initialize_task("E:\\workplace\\FCFS\\data2.txt");


	        Runnable first=new task_list(fcfs);
	        Runnable second=new task_list(fcfs1);

	        Thread thread1=new Thread(first);
	        Thread thread2=new Thread(second);

	        thread1.start();
	        thread2.start();
	        //for(int i=0;i<fcfs.getTasks().length;i++)
	        //{
	           // System.out.println(fcfs.getTasks()[i].getTaskID()+" "+fcfs.getTasks()[i].getArrivalTime()+" "+fcfs.getTasks()[i].getServiceTime());
	       // }


	    }

	    static class task_list implements  Runnable{
	       FCFS fcfs;
	        public task_list(FCFS a){
	           fcfs=a;
	       }
	        @Override
	        public void run() {
	            try {
	                fcfs.Incominglist();
	                fcfs.dealtask();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	        }
	    }
}


