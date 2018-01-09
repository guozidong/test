package edu.fjnu.Fcfs2.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task {
	 private int taskID;//任务ID
	    private int arrivalTime;//到达时间
	    private int serviceTime;//服务时间
	    private int startingTime;//开始时间
	    private int sign;//是否完成的标志,1为完成，0为未完成
	    private int finishingTime;//完成时间=开始时间+服务时间
	    private int turnAroundTime;//周转时间=完成时间-到达时间
	    private double weightTurnAround;//带权周转时间=周转时间/服务时间



	    public int getTaskID() {
	        return taskID;
	    }

	    public int getArrivalTime() {
	        return arrivalTime;
	    }

	    public int getServiceTime() {
	        return serviceTime;
	    }

	    public int getStartingTime() {
	        return startingTime;
	    }

	    public int getFinishingTime() {
	        int a=0;
	        a=startingTime+serviceTime;
	        finishingTime=a;
	        return finishingTime;
	    }

	    public int getTurnAroundTime() {
	        int a=0;
	        a=finishingTime-arrivalTime;
	        turnAroundTime=a;
	        return turnAroundTime;
	    }

	    public double getWeightTurnAround() {
	        double a=0;
	        a=turnAroundTime/serviceTime;
	        weightTurnAround=a;
	        return weightTurnAround;
	    }

	    public void setTaskID(int taskID) {
	        this.taskID = taskID;
	    }

	    public void setArrivalTime(int arrivalTime) {
	        this.arrivalTime = arrivalTime;
	    }

	    public void setServiceTime(int serviceTime) {
	        this.serviceTime = serviceTime;
	    }

	    public void setStartingTime(int startingTime) {
	        this.startingTime = startingTime;
	    }

	    public void setFinishingTime(int finishingTime) {
	        this.finishingTime = finishingTime;
	    }

	    public void setTurnAroundTime(int turnAroundTime) {
	        this.turnAroundTime = turnAroundTime;
	    }

	    public void setWeightTurnAround(double weightTurnAround) {
	        this.weightTurnAround = weightTurnAround;
	    }

	    public int getSign() {
	        return sign;
	    }

	    public void setSign(int sign) {
	        this.sign = sign;
	    }
	}

