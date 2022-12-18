package Serialization;

public class Person {
	public String name;
	public int age;
	Person(String name, int num){
		this.name = name;
		this.age = num;
	}

	Person(){

	}
	@Override
	public String toString(){
		return "Person: " + "name = " + name + " + " + "age = " + age + ".";
	}
}
