package com.datapack.model;

public class DataPack {
	
	 private  String brand;
	 private String type;
	 private Integer duration;
	 private double price;
	 private Integer Id;
	public DataPack(String brand, String type, Integer duration, double price, Integer id) {
		super();
		this.brand = brand;
		this.type = type;
		this.duration = duration;
		this.price = price;
		Id = id;
	}
	public DataPack() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "DataPack [brand=" + brand + ", type=" + type + ", duration=" + duration + ", price=" + price + ", Id="
				+ Id + "]";
	}
	 

}
