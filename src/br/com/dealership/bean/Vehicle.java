package br.com.dealership.bean;

public class Vehicle {

	// Attributes
	private Integer id;
	private String category;
	private String licensePlate;
	private String brand;
	private String model;
	private String manufacturingYear;
	private Double price;
	
	// Methods
	public Vehicle() {
	}
	
	public Vehicle(Integer id, String category, String licensePlate, String brand, String model, String manufacturingYear, Double price) {
		super();
		this.id = id;
		this.category = category;
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.model = model;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
	}
	
	// Getters and Setters
	public Integer getId() {
		return id;
	}
	
	public String getlicensePlate() {
		return licensePlate;
	}

	public String getCategory() {
		return category;
	}

	public Double getPrice() {
		return price;
	}

	public String getManufacturingYear() {
		return manufacturingYear;
	}

	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setlicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setManufacturingYear(String manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
