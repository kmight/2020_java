package test;

public class Person {
	    private String name ;
	    private int sum ;
	    private double avg ;
	    private String hak ;
	    private int rank = 1 ;
	    
		public Person() { }

		public void s_sum(int kor, int eng, int math) {
			this.sum = kor + eng + math;
			s_avg();
			s_hak();
		}
		
		public void s_hak() {
			if(this.sum >= 90) {
				hak = "A";
			} else if(this.sum >= 80) {
				hak = "B";
			} else if(this.sum >= 70) {
				hak = "C";
			} else {
				hak = "F";
			}
		}
		
		public void s_avg() {
			this.avg = (int)((this.sum/3.0*10)/10);
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
