package com.assignment.model;

public class Table {
	
	private Long id;
	private Integer number;
	private Integer capacity;
	
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Table(Long id, Integer number, Integer capacity) {
		super();
		this.id = id;
		this.number = number;
		this.capacity = capacity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Table [id=" + id + ", number=" + number + ", capacity=" + capacity + "]";
	}
	
	public static Table createTable(String line) {
		return null;
	}
}
