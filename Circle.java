
public class Circle {
	double radius;
	final static double PI= 3.14;
	void setRadius(int r) { //setter �Լ�
		radius = r;
	}
	
	double getArea() {
		double area = radius * radius *PI;
		return area;
	}
}
