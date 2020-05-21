
public class TestStudent {
	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.setEng(83);
		stu.setKor(83);
		stu.setMath(86);
		
		System.out.println(stu.average());
		System.out.println(stu.grade());
	}
}
