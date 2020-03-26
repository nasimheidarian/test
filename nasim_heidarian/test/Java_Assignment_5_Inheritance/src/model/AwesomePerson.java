package model;

public class AwesomePerson extends Person {
	
	public AwesomePerson() {
		
	}

	public void talk(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name+" "+this.age);
		
	}
}
