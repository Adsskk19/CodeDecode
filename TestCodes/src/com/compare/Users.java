package com.compare;

import java.util.Objects;

public class Users {
	
	private int id;
	private String name;
	private String domain;
	public Users() {
		super();
	}
	public Users(int id, String name, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
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
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", domain=" + domain + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(domain, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(domain, other.domain) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	

}
