package listItemInGenericsAndCollection;

public class LineItem {
	private final int id;
	private final String name;
	private final double unitPrice;
	private int quantity;

	public LineItem(int id, String name, int quantity, double unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return unitPrice;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}

	public double calculateTotalPrice() {
		return (this.quantity * this.unitPrice);
	}
}

