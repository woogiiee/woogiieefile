
public class Student {
	double kor, eng, math;
	double avg;
	
	void setKor(double k) {
		kor =k;
	}
	void setEng(double e) {
		eng = e;
	}
	void setMath(double m) {
		math = m;
	}
	
	double average() {
		double avg =  (kor+eng+math)/3;
		return avg;
	}
	char grade() {
		char grade;
		if(avg>=90) {
			grade = '��';
		}
		else if (avg>=80) {
			grade = '��';
		}
		else if(avg>=70) {
			grade = '��';
		}
		else if(avg>=60) {
			grade = '��';
		}
		else {
			grade = '��';
		}
		return grade;
	}
	
}

