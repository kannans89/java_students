package reflection;

import java.lang.reflect.*;

public class Reflection {

	public static void main(String args[]) throws Exception {

		@SuppressWarnings("rawtypes")
		Class c = Class.forName(args[0]);
		//Array c=new Array();
		
		System.out.println("Fields....");
		Field f[] = c.getDeclaredFields();

		for (int i = 0; i < f.length; i++)
			System.out.println(f[i]);
		System.out.println("no of field=" + f.length);

		System.out.println("Constructors");
		@SuppressWarnings("rawtypes")
		Constructor con[] = c.getDeclaredConstructors();

		for (int i = 0; i < con.length; i++)
			System.out.println(con[i]);
		System.out.println("no of COnstructor=" + con.length);

		System.out.println("Methods....");
		Method m[] = c.getDeclaredMethods();

		for (int i = 0; i < m.length; i++)
			System.out.println(m[i]);
		System.out.println("no of Methods=" + m.length);

	}
}
