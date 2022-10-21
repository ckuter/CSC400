import java.util.LinkedList;
import java.util.Queue;

public class Order {
	private Queue<Customer> queue;
	
	public Order() {
		queue = new LinkedList<Customer>();
	}
	
	public void addOrder(Customer cust, Display disp) {
		queue.add(cust);
		disp.insertOrder(cust);
	}
	
	public Customer removeOrder(Display disp) {
		if (queue.isEmpty()) {
			return null;
		}
		Customer cust = queue.remove();
		disp.removeOrder(cust);
		return cust;
	}

}
