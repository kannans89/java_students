package customAnnotaion;

public class HellowAnnotation {

		@MyAnnotation
		public void m1() {
			System.out.println("Hellow A");
		}

		
		public void m2() {
			System.out.println("Hellow B");
		}

		public void m3() {
			System.out.println("Hellow C");
		}

		@MyAnnotation
		public void m4() {
			System.out.println("Hellow D");
		}

	}