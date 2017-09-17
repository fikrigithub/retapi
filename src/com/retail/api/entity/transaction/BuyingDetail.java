package com.retail.api.entity.transaction;

import java.io.Serializable;

public class BuyingDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int buyingId;
	private int item;
	private double price;
	private int numOfItem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBuyingId() {
		return buyingId;
	}

	public void setBuyingId(int buyingId) {
		this.buyingId = buyingId;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumOfItem() {
		return numOfItem;
	}

	public void setNumOfItem(int numOfItem) {
		this.numOfItem = numOfItem;
	}

}
