package Serialization;

public interface Serialize{
	void write(Object obj,String fileName);
	<T> T read(String fileName, Class<T> clazz);
	//TODO tupe ref
}
