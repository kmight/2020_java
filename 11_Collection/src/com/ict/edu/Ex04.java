package com.ict.edu;

public class Ex04 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;
	
	public Ex04() {}

	public Ex04(String name, int sum, double avg, String hak, int rank) {
		this.name = name;
		this.sum = sum;
		this.avg = avg;
		this.hak = hak;
		this.rank = rank;
	}

	// 합계구하기
	public void s_sum(int kor, int eng, int math) {
		this.sum = kor + eng + math;
	}
	
	// 평균구하기
	public void s_avg() {
		this.avg = (int)((this.sum/3.0 * 10)/10.0);
	}
	
	// 학점구하기
	public void s_hak() {
		
		if(this.avg >= 90) {
			this.hak = "A";
		} else if(this.avg >= 80) {
			this.hak = "B";
		} else if(this.avg >= 70) {
			this.hak = "C";
		} else {
			this.hak = "F";
		}
	}

	// Generate getter setter
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

	public void setAvg(double avg) {
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
