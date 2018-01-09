package edu.fjnu.Fcfs2.demo;
import javax.swing.text.html.HTMLDocument;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
public class FCFS {
	private List<Task> list =new ArrayList<Task>();
    private int ID;//队列ID
    private Task[] tasks;
    public FCFS(int ID){
        this.ID=ID;
        this.tasks=new Task[100];
        for(int i=0;i<100;i++){
            tasks[i]=new Task();
        }
    }

    public void initialize_task(String pathname){//容易出错,初始化任务数值
        int i=0;
        try {
            Scanner in = new Scanner(new File("C:\\Users\\25116\\Desktop\\JAVA程序设计\\JavaProject\\DemoJavaFCFS-20171123\\input.txt"));
            while (in.hasNextLine()) {
                String str = in.nextLine();
                splitt(str,i);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void splitt(String str,int i){
        String strr=str.trim();
        String[] abc =strr.split("[\\p{Space}]+");
        String str1=abc[0];
        String str2=abc[1];
        String str3=abc[2];
        tasks[i].setTaskID(Integer.parseInt(str1));
        tasks[i].setArrivalTime(Integer.parseInt(str2));
        tasks[i].setServiceTime(Integer.parseInt(str3));
    }

    public void addTask(Task task){
        list.add(task);
    }

    public  void Incominglist() throws InterruptedException {//进列表操作
        for(int i=0;i<tasks.length;i++){
            addTask(tasks[i]);
        }
    }

    public void dealtask()throws InterruptedException{//处理操作
        int start=0;
        //Iterator<Task> iter = list.iterator();
        for(int i=0;i<list.size();i++) {
            list.get(i).setStartingTime(start);
            System.out.println("队列"+ID+"处理:任务ID:"+list.get(i).getTaskID()+"  "+"arriveTime:"+list.get(i).getArrivalTime()+
                    "  "+"startTime:"+list.get(i).getStartingTime()+"  "+"serviceTime:"+list.get(i).getServiceTime()
                    +"  "+"finishTime:"+list.get(i).getFinishingTime()+"  "+"turnAroundTime:"+list.get(i).getTurnAroundTime()
                    +"  "+"weightTurnAround:"+list.get(i).getWeightTurnAround());
            //Thread.sleep(iter.next().getServiceTime() * 100);
            //list.get(iter.next().getArrivalTime()).setSign(1);
            //System.out.println("任务"+iter.next().getTaskID()+"处理完成");
            start=start+list.get(i).getServiceTime();
        }
    }


    public List<Task> getList() {
        return list;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setList(List<Task> list) {
        this.list = list;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

}
