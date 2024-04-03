package com.aloofly.zmart_applicatiom.model;

public class Product {
	private int id;
	private String productName;
	private String price;
	private String companyName;
	private String ManufactureDate;
	private String expiryDate;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setProductname(String productName) {
		this.productName = productName;
	}

	public String getProductname() {
		return productName;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setCompanyname(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyname() {
		return companyName = companyName;
	}

	public void setManufacturedate(String manufactureDate) {
		this.ManufactureDate = manufactureDate;
	}

	public String getManufacturedate() {
		return ManufactureDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getExpirydate() {
		return expiryDate;
	}

}
