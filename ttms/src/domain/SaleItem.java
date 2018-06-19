package domain;

import java.io.Serializable;

public class SaleItem implements Serializable {
	private Integer id;
	private Ticket ticket;
	private float price;
	private Integer num;
	private Integer ticket_id;
	
	
	public Integer getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Integer ticket_id) {
		this.ticket_id = ticket_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public float getPrice() {
		return num*ticket.getPrice();
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	
}
