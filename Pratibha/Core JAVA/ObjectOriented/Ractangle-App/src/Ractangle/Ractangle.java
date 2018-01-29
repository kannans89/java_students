package Ractangle;

public class Ractangle {
	private int width;
	private int height;

	public void setWidth(int parameterWidth) {
		if (parameterWidth > 0)
			width = parameterWidth;
	}

	public int getWidth() {
		return width;
	}

	public void setheight(int parameterHeight) {
		if (parameterHeight > 0)
			height = parameterHeight;
	}

	public int getheight() {
		return height;
	}

	public int calculateArea() {
		return height * width;

	}
}