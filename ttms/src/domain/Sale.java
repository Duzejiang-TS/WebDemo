package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Sale implements Serializable{
	private Integer id;
	private String sale_num;//订单号
	private List<SaleItem> items = new ArrayList<SaleItem>();
	private Date sale_time;//订单时间
	private Integer sale_status;
	private Employee emp;
	private float price;
	
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getSale_status() {
		return sale_status;
	}
	public void setSale_status(Integer sale_status) {
		this.sale_status = sale_status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSale_num() {
		return sale_num;
	}
	public void setSale_num(String sale_num) {
		this.sale_num = sale_num;
	}
	public List<SaleItem> getItems() {
		return items;
	}
	public void setItems(List<SaleItem> items) {
		this.items = items;
	}
	public Date getSale_time() {
		return sale_time;
	}
	public void setSale_time(Date sale_time) {
		this.sale_time = sale_time;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public void add(Ticket ticket) {
		SaleItem item = new SaleItem();
		item.setTicket(ticket);
		item.setNum(1);
		item.setPrice(ticket.getPrice());
		items.add(item); 
	}
	
}
