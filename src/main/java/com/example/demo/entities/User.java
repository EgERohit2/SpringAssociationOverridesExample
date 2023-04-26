package com.example.demo.entities;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.AssociationOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String name, Address homeAddress) {
		super();
		this.id = id;
		this.name = name;
		this.homeAddress = homeAddress;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "home_address_id")
	@AssociationOverrides({
			@AssociationOverride(name = "address", joinColumns = @JoinColumn(name = "home_address_id")) })
	private Address homeAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", homeAddress=" + homeAddress + "]";
	}

}
