
public class Dog {
	String name = null;
	String breed = null;
	int age=0;
	
	Dog(String n, int a) {
		name = n;
		age = a;
	}
	Dog(String name, String breed, int age) {
		this.name = name;
		this.age= age;
		this.breed = breed;
	}
	
	void Dogprint(){
		System.out.println("�̸���"+name);
		System.out.println("������"+breed);
		System.out.println("���̴�"+age);
	
}
}