package com.exercise13oppstatic.model;

public class Car {
	private String serialNumber;
	private static int numberDoors;
	private boolean isCoupe = false;
	private String brand;
	
	public Car() {
		
	}
	public Car(String serialNumber, int numberDoors) {
		this.serialNumber = serialNumber;
		this.numberDoors = numberDoors;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getNumberDoors() {
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	public void CarIsCoupe(boolean isCoupe) {
		this.isCoupe = isCoupe;
		if(this.isCoupe) {
			this.numberDoors = 2;
		}else {
			this.numberDoors = 4;
		}
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String ToString() {
		return "serial number: ["+serialNumber+"], number of doors: ["+numberDoors+"], brand: ["+brand+"], coupe: ["+isCoupe+"]";
	}
}
