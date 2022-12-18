package Serialization;

import java.io.*;

public class SerializeToTXT implements Serialize{

	@Override
	public void write(Object obj,String fileName){
		try{
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			out.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

	@Override
	public <T> T read(String fileName, Class<T> clazz){
		try{
			T result = clazz.newInstance();
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			result = (T) in.readObject();
			in.close();
			fileIn.close();
			return result;
		}catch(IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e){
			System.out.println(e);
		}
		return null;
	}
}

