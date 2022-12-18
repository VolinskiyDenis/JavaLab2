package Serialization;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class SerializeToXML <T> implements Serialize{

	@Override
	public void write(Object obj,String fileName){
		try{
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.writeValue(new File(fileName),obj);

		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public <T> T read(String fileName, Class<T> clazz){
		try{
			XmlMapper xmlMapper = new XmlMapper();
			return xmlMapper.readValue(new File(fileName), clazz);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		return null;
	}

}
