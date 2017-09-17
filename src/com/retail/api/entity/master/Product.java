package com.retail.api.entity.master;

import java.io.Serializable;

public class Product implements Serializable {

	/**            
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double buyingPrice;
	private double sellingPrice;
	private int stock;
	private double discount;
	private int category;
	private String[] listImage;

	public Product() {
	}

	public Product(int id, String name, double buyingPrice, double sellingPrice,
			int stock, double discount, int category, String[] listImage) {
		this.id = id;
		this.name = name;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		this.stock = stock;
		this.discount = discount;
		this.category = category;
		this.listImage = listImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String[] getListImage() {
		return listImage;
	}

	public void setListImage(String[] listImage) {
		this.listImage = listImage;
	}

}