package br.com.dealership.bean;

public class Vehicle {

	// Attributes
	private Long id;
	private String licensePlate;
	private String category;
	private Double total;
	private Integer manufacturingYear;
	private String model;
	private String brand;
	
	// Methods
	public Vehicle() {
	}
	
	public Vehicle(Long id, String licensePlate, String category, Double total, Integer manufacturingYear, String model, String brand) {
		super();
		this.id = id;
		this.licensePlate = licensePlate;
		this.category = category;
		this.total = total;
		this.manufacturingYear = manufacturingYear;
		this.model = model;
		this.brand = brand;
	}
	
	// Getters and Setters
	public Long getId() {
		return id;
	}
	
	public String getlicensePlate() {
		return licensePlate;
	}

	public String getCategory() {
		return category;
	}

	public Double getTotal() {
		return total;
	}

	public Integer getManufacturingYear() {
		return manufacturingYear;
	}

	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setlicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public void setManufacturingYear(Integer manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
