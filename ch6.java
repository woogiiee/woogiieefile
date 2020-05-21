
/*double myHeight = 175.9;
	hiEveryone(12, 12.5);
	hiEveryone(13, myHeight);
	byEveryone();
}
public static void hiEveryone(int age, double height) {
	System.out.println("제 나이는 "+age+ "세 입니다");
	System.out.println("저의 키는"+height+"cm입니다.");
}
public static void byEveryone() {
	System.out.println("다음에 뵙겠습니다.");*/

/*
	public static void main(String[] args) {
	int result;
	result = adder(4,5);
	System.out.println("4+5= "+result);
	System.out.println("3.5X3.5= "+square(3.5));
	
}
public static int adder(int num1, int num2) {
	int addResult = num1 + num2;
	return addResult;
}
public static double square(double num) {
	return num*num; */
/*divide(4,2);
		divide(6,2);
		divide(9,0);
	}
	public static void divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과: "+(num1/num2));
	}
}*/
//함수 이름 sub로 하여 두수를 포함한 함수를 만드시오.
/*public static void main(String[] args) {
		
		int result;
		result=sub(5,4);
		System.out.println("5-4="+result);
	}
	public static int sub(int num1, int num2) {
		int subresult = num1-num2;
		return subresult;*/
/*		int result = mul (10,20);
 * System.out.println("20x10 ="+result);
}
	public static int mul(int num1, int num2) {
		int mulresult = num1*num2;
		return mulresult;
	}*/

/*		double result;
		result= avg(60,70,80);
		System.out.println("60,70,80의 평균은"+result);
		
	}		
	public static double avg(double num1, double num2, double num3) {
		double result = (num1+num2+num3)/3;
		return result;
		
	//평균 . 수우미양가
/*	public static void main(String[] args) {
		int kor = 70;
		int math = 90;
		int eng = 60;
		double avg = avg(70,60,90);
		System.out.println(avg);
	}
	static double avg(int kor, int eng, int math) {
		
	double avg = (kor +eng +(double)math)	/(double)3;
	return avg;
	}
}*/
/*	
	System.out.println(gradeName(100)+"입니다");
	}
		static char gradeName(double num) {
			char grade;
			if(num>=90) {
				grade= '수';
			}
			else if(num>=80) {
				grade= '우';
			}
			else if(num>=70) {
				grade= '미';
			}
			else {
				grade= '가';
				
			}
			return grade;
}*/
//원의 넓이
/*public static void main(String[] args) {
		double circleArea = getCircleArea(5);
		
		System.out.println(circleArea);
		
	}
	static double getCircleArea(double radius) {
			final double PI = 3.14;
			double area = radius * radius *PI;
			return area;*/
//삼각형 넓이
/*
	public static void main(String[] args) {
		int width = 6;
		int height = 5;
		
		System.out.println(getTriangleArea(width,height));
	}
	static double getTriangleArea(double height, double width) {
		double area;
		area = height *width /2;
		return area;
	}*/
//구구단 출력
/*	public static void main(String[] args) {
		gugudan();
		
	}	
	
	static void gugudan() {
		
		for(int j=1;j<10;j++) {
			
		for(int i=2;i<10;i++) {
			System.out.print(i+"x"+j+"="+(i*j)+"\t");
			
		}System.out.println();
		}*/
//		int num1 =11;
//		if (ste) {
//			int num1= 22;
//			num1++;
//			System.out.println(num1);
//		
//		int num1= 33;
//		num1++;
//		System.out.println(num1);
//	
//		System.out.println("3 factorial: "+ factorial(3));
//		System.out.println("12 factorial : "+factorial(12));
//	}
//	public static int factorial(int n) {
//		if(n==1)
//			return 1;
//		else	
//			return n*factorial(n-1);
public class ch6 {
	public static void main(String[] args) {
		boolean ste= true;
//		int num1 =11;
		if (ste) {
			int num1= 22;
			num1++;
			System.out.println(num1);
		}
		int num1= 33;
		num1++;
		System.out.println(num1);
	
	}
}
