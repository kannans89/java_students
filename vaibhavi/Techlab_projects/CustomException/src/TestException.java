
public class TestException {

	public static void main(String[] args) {

		try
		{
		new Rectangle(-3,10);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
