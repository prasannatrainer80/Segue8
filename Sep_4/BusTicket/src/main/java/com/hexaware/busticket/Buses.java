package com.hexaware.busticket;

public class Buses {

	private int busId;
	private String busNumber;
	private String busType;
	private int busOperatorId;
	private int seatCapacity;
	private int availableSeats;
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getBusOperatorId() {
		return busOperatorId;
	}
	public void setBusOperatorId(int busOperatorId) {
		this.busOperatorId = busOperatorId;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Buses(int busId, String busNumber, String busType, int busOperatorId, int seatCapacity, int availableSeats) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.busType = busType;
		this.busOperatorId = busOperatorId;
		this.seatCapacity = seatCapacity;
		this.availableSeats = availableSeats;
	}
	public Buses() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Buses [busId=" + busId + ", busNumber=" + busNumber + ", busType=" + busType + ", busOperatorId="
				+ busOperatorId + ", seatCapacity=" + seatCapacity + ", availableSeats=" + availableSeats + "]";
	}
	
}
