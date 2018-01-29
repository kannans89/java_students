package customAnnotaion;

import java.lang.reflect.Method;

public class TestAnnotation {
	public static void main(String[] args) {

		HellowAnnotation ha = new HellowAnnotation();
		Method[] methods = ha.getClass().getMethods();

		for (Method method : methods) {
			MyAnnotation ma = method.getAnnotation(MyAnnotation.class);
			if (ma != null) {
				try {
					method.invoke(ha);
				} catch (Exception e) {
					throw new IllegalStateException();
					
				}
			}
		}
	}
}


 