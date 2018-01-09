package work.me.demo.java;
import java.io.Serializable;
public class Student implements Serializable {
    private static final long seriaVersionUID = 1234L;
    private long studentID;
    private String name;
    private String sex;
    public Student(long studentID,String name,String sex){
    	this.studentID = studentID;
    	this.name = name;
    	this.sex = sex;
    	}
    public String toString(){
    	return  "student:"+studentID+" "+name+" "+sex;
    }
}
