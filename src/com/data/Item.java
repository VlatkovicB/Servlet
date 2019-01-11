package com.data;

public class Item {
	private int id;
	private String name;
	private String desc;
	private boolean available;

	public Item(int id, String name, String desc, boolean available) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.available = available;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailability(boolean available) {
		this.available = available;
	}

	public String available() {
		if (this.available == true) {
			return " available";
		} else {
			return " unavailable";
		}
	}
}
