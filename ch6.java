
/*double myHeight = 175.9;
	hiEveryone(12, 12.5);
	hiEveryone(13, myHeight);
	byEveryone();
}
public static void hiEveryone(int age, double height) {
	System.out.println("�� ���̴� "+age+ "�� �Դϴ�");
	System.out.println("���� Ű��"+height+"cm�Դϴ�.");
}
public static void byEveryone() {
	System.out.println("������ �˰ڽ��ϴ�.");*/

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
			System.out.println("0���� ���� �� �����ϴ�.");
			return;
		}
		System.out.println("������ ���: "+(num1/num2));
	}
}*/
//�Լ� �̸� sub�� �Ͽ� �μ��� ������ �Լ��� ����ÿ�.
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
		System.out.println("60,70,80�� �����"+result);
		
	}		
	public static double avg(double num1, double num2, double num3) {
		double result = (num1+num2+num3)/3;
		return result;
		
	//��� . ����̾簡
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
	System.out.println(gradeName(100)+"�Դϴ�");
	}
		static char gradeName(double num) {
			char grade;
			if(num>=90) {
				grade= '��';
			}
			else if(num>=80) {
				grade= '��';
			}
			else if(num>=70) {
				grade= '��';
			}
			else {
				grade= '��';
				
			}
			return grade;
}*/
//���� ����
/*public static void main(String[] args) {
		double circleArea = getCircleArea(5);
		
		System.out.println(circleArea);
		
	}
	static double getCircleArea(double radius) {
			final double PI = 3.14;
			double area = radius * radius *PI;
			return area;*/
//�ﰢ�� ����
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
//������ ���
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
