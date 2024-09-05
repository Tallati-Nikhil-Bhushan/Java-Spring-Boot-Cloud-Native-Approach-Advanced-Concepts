
import java.io.Serializable;

public class PurchaseOrder implements Serializable{
	@Override
	public String toString() {
		return "PurchaseOrder [orderID=" + orderID + ", company=" + company + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	private String orderID;
	private String company;
	private int quantity;
	//you can use transient keyword to make a field secure or to prevent it from being serialized
	private transient double price;
	
	public PurchaseOrder() {
		// TODO Auto-generated constructor stub
	}

	public PurchaseOrder(String orderID, String company, int quantity, double price) {
		super();
		this.orderID = orderID;
		this.company = company;
		this.quantity = quantity;
		this.price = price;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
