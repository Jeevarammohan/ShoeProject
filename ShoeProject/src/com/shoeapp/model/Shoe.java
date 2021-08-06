package com.shoeapp.model;

public class Shoe {
	private long serialNo;
	private String brandName;
	private int size;
	private double price;
	public Shoe(long serialNo, String brandName, int size, double price) {
		super();
		this.serialNo = serialNo;
		this.brandName = brandName;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shoe [serialNo=" + serialNo + ", brandName=" + brandName + ", size=" + size + ", price=" + price + "]";
	}
	public long getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
