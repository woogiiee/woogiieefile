
public class Triangle {
	int width, height;
	
	void setWidth(int w) {
		width = w;
	}
	void setHeight(int h) {
		height= h;
	}

	int getArea()	{
		return width * height/2;
	}
}