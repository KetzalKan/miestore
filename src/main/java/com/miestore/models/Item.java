package com.miestore.models;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id", nullable = false)
	private ItemCategory category;
	private String name;
	private String description;
	private BigInteger centsPrice;

	public Item() {

	}

	public Item(ItemCategory category, String name, String description, BigInteger centsPrice) {
		super();
		this.category = category;
		this.name = name;
		this.description = description;
		this.centsPrice = centsPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ItemCategory getCategory() {
		return category;
	}

	public void setCategory(ItemCategory category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return centsPrice.floatValue() / 100;
	}

	public void setPrice(BigInteger centsPrice) {
		this.centsPrice = centsPrice.multiply(new BigInteger("100"));
	}

	@Override
	public String toString() {
		return "Item [category=" + category + ", name=" + name + ", description=" + description + ", centsPrice="
				+ centsPrice + "]";
	}

}
