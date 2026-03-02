package AtividadeEnum;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import AtividadeEnum.enums.OrderStatus;

public class order {
	private Date moment;
	private OrderStatus status;

	private cliente cliente;

	private List<orderItem> items = new ArrayList<orderItem>();

	public order() {
	}
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public order(Date moment, OrderStatus status, AtividadeEnum.cliente cliente) {
		super();
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(orderItem item) {
		items.add(item);
	}
	
	public void removeItem(orderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum  = 0.0;
		for (orderItem it : items) {
			sum += + it.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Order moment: ");
	    sb.append(sdf.format(moment) + "\n");
	    sb.append("Order status: ");
	    sb.append(status + "\n");
	    sb.append("Client: ");
	    sb.append(cliente + "\n");
	    sb.append("Order items:\n");
	    for (orderItem item : items) {
	        sb.append(item + "\n");
	    }

	    sb.append("Total price: $");
	    sb.append(String.format("%.2f", total()));
	    return sb.toString();
	}
	
	
	
}