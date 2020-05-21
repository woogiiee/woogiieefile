
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
		System.out.println("이름은"+name);
		System.out.println("종류는"+breed);
		System.out.println("나이는"+age);
	
}
}