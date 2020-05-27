package com.ict.edu8;

import java.io.Serializable;

public class VO implements Serializable{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	private String hak;
	private int rank;
	
	public VO() {}
	
	public VO(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void s_calc() {
		this.sum = this.kor + this.eng + this.math;
		this.avg = (int)(this.sum/3.0 * 10)/10;
		if(this.avg >= 90) {
			this.hak = "A";
		} else if(this.avg >= 80) {
			this.hak = "B";
		} else if(this.avg >= 70) {
			this.hak = "B";
		} else {
			this.hak = "F";
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
