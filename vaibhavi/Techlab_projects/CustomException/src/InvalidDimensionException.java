
public class InvalidDimensionException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int height;
	private int width;
	
	public InvalidDimensionException(String error,Rectangle r)
	{
		height=r.getHeight();
		width=r.getWidth();
		
		
	}
	@Override
	public String getMessage()
	{
		return "Height and width is invalid. Height is " +height + "width is" +width;
	}

}
