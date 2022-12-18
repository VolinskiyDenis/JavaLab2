package Serialization;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerializeToJSON implements Serialize{
	public TypeReference<Person> type = new TypeReference<>() {};

	@Override
	public void write(Object obj, String fileName){
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValue(new File(fileName),obj);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public <T> T read(String fileName, Class<T> clazz){
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(new File(fileName), clazz);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		return null;
	}

}
