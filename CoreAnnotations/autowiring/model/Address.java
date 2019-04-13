package com.bridgelabz.spring.autowiring.model;

public class Address {
private String fullAddress;

public String getFullAddress() {
	return fullAddress;
}

public void setFullAddress(String fullAddress) {
	this.fullAddress = fullAddress;
}

@Override
public String toString() {
	return "Address [fullAddress=" + fullAddress + "]";
}

}
