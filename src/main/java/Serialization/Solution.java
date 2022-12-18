package Serialization;

public class Solution {
	public static void main(String[] args){
		Person person = new Person("someName",69), personDeserialize;
		Car car = new Car("Audi A4",300), carDeserialize;

		SerializeToJSON serializeToJSON = new SerializeToJSON(); // json serialization
		serializeToJSON.write(person, "serPerson.json");
		personDeserialize = serializeToJSON.read("serPerson.json",Person.class);
		System.out.println(personDeserialize);

		SerializeToJSON serializeToJSON2 = new SerializeToJSON(); // json serialization for another class
		serializeToJSON2.write(car, "serCar.json");
		carDeserialize = serializeToJSON2.read( "serCar.json",Car.class);
		System.out.println(carDeserialize);

		SerializeToXML<Person> serializeToXML = new SerializeToXML<>(); // xml serialization
		serializeToXML.write(person, "ser.xml");
		personDeserialize = serializeToXML.read("ser.xml", Person.class);
		System.out.println(personDeserialize);

		SerializeToTXT serializeToTXT = new SerializeToTXT(); // txt serialization
		serializeToTXT.write(person, "ser.txt");
		personDeserialize = serializeToTXT.read("ser.txt", Person.class);
		System.out.println(personDeserialize);

		SerializeToTXT serializeToTXT2 = new SerializeToTXT(); // txt serialization for another class
		serializeToTXT2.write(car, "serCar.txt");
		carDeserialize = serializeToTXT2.read( "serCar.txt",Car.class);
		System.out.println(carDeserialize);
	}
}
