package com.techlabs.contactbook.model;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class ContactBookRepository implements Serializable {
	private  List<Person> list;
	
	public ContactBookRepository()
	{
		list= new ArrayList<Person>();
	}
	
	public void add(Person contact) throws IOException {
		 ObjectOutputStream outputStream;
		 FileOutputStream file;
		list.add(contact);

			file = new FileOutputStream("ContactData.ser");
			outputStream = new ObjectOutputStream(file);
			outputStream.writeObject(list);
			outputStream.close();
	}
	@SuppressWarnings("unchecked")
	public List<Person> retriveDetails() throws Exception{
		
		FileInputStream file1 = new FileInputStream("ContactData.ser");
		ObjectInputStream inputStream = new ObjectInputStream(file1);
		ArrayList<Person> list1 = new ArrayList<Person>();

		list1 = ((ArrayList<Person>) inputStream.readObject());
		inputStream.close();
		return list1;

	}

}
