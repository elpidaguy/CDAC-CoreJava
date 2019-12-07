package io_utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.Customer;

public class IOUtils {

	@SuppressWarnings("unchecked")
	public static HashMap<String,Customer> readObject() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream out = new ObjectInputStream(new FileInputStream("myHashMap"));
		System.out.println("File Restored");
		return (HashMap<String, Customer>) out.readObject();
	}
	
	public static void writeObject(HashMap<String,Customer> customerMap)
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("myHashMap"))) {
			out.writeObject(customerMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
