package edu.fjnu.Fcfs2.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task {
	 private int taskID;//����ID
	    private int arrivalTime;//����ʱ��
	    private int serviceTime;//����ʱ��
	    private int startingTime;//��ʼʱ��
	    private int sign;//�Ƿ���ɵı�־,1Ϊ��ɣ�0Ϊδ���
	    private int finishingTime;//���ʱ��=��ʼʱ��+����ʱ��
	    private int turnAroundTime;//��תʱ��=���ʱ��-����ʱ��
	    private double weightTurnAround;//��Ȩ��תʱ��=��תʱ��/����ʱ��



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

