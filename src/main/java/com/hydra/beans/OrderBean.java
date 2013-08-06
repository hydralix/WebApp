package com.hydra.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "order")
@SessionScoped
public class OrderBean implements Serializable{

	private static final long serialVersionUID = 1L;
	String street;
	String house;
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	private static final ArrayList<Order> orderList = 
			new ArrayList<Order>(Arrays.asList(
			new Order("Ленина", "24В")

		));
	 
	public ArrayList<Order> getOrderList() {
		return orderList;
	}
	
	public String addAction() {
		Order order = new Order(this.street, this.house);
	 	orderList.add(order);
		return null;
	}
	
	public String deleteAction(Order order) {
		orderList.remove(order);
		return null;
	}
	
	public static class Order{
		 
		String street;
		String house;
 
		public Order(String street, String house) {
			this.street = street;
			this.house = house;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getHouse() {
			return house;
		}

		public void setHouse(String house) {
			this.house = house;
		}
	}
	
}
