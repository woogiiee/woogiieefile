
public class TV {
	String name =  null;
	int year= 0;
	int wide=0;
	
	TV(String name, int year, int wide) {
		this.name = name;
		this.year = year;
		this.wide = wide;
		
	}
	void show() {
		System.out.println(name+"에서 만든"+year+"년 형"+wide+"인치 tv");
	}
	
}
