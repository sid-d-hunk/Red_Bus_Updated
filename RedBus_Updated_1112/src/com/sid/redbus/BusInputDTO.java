package com.sid.redbus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BusInputDTO {

	private String fromDate;
	private String  toDate;	
	private String fromCity;
	private String toCity;
	private String busNo;
	private String busName;	
	private boolean isAc=false;
	private boolean isVolvo=false;
	private boolean isFood=false;
	private boolean isSeparetladiesseat=false;
	private  boolean smsAlert=false;
	private String contactNumber;	
	private String busManager;	
	

	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public boolean isAc() {
		return isAc;
	}
	public void setAc(boolean isAc) {
		this.isAc = isAc;
	}
	public boolean isVolvo() {
		return isVolvo;
	}
	public void setVolvo(boolean isVolvo) {
		this.isVolvo = isVolvo;
	}
	public boolean isFood() {
		return isFood;
	}
	public void setFood(boolean isFood) {
		this.isFood = isFood;
	}
	public boolean isSeparetladiesseat() {
		return isSeparetladiesseat;
	}
	public void setSeparetladiesseat(boolean isSeparetladiesseat) {
		this.isSeparetladiesseat = isSeparetladiesseat;
	}
	public boolean isSmsAlert() {
		return smsAlert;
	}
	public void setSmsAlert(boolean smsAlert) {
		this.smsAlert = smsAlert;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getBusManager() {
		return busManager;
	}
	public void setBusManager(String busManager) {
		this.busManager = busManager;
	}
	
	

}

	
