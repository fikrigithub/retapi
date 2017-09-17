package com.retail.api.entity.transaction;

import java.io.Serializable;

public class SellingDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int sellingId;
	private int item;
	private double price;
	private double adminFee;
	private int numOfItem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSellingId() {
		return sellingId;
	}

	public void setSellingId(int sellingId) {
		this.sellingId = sellingId;
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

	public double getAdminFee() {
		return adminFee;
	}

	public void setAdminFee(double adminFee) {
		this.adminFee = adminFee;
	}

	public int getNumOfItem() {
		return numOfItem;
	}

	public void setNumOfItem(int numOfItem) {
		this.numOfItem = numOfItem;
	}

}
