package com.clone;

import java.util.Objects;

public class Address implements Cloneable{
	
	private String street;
	private long pincode;
	
	
	public Address() {
		super();
	}
	public Address(String street, long pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public long getPincode() {
		return pincode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pincode, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return pincode == other.pincode && Objects.equals(street, other.street);
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}


	
}
