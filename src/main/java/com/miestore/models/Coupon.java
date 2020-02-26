package com.miestore.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Coupon extends AuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="item_id", referencedColumnName="id", nullable=false)
	@JsonIgnore
	private Item item;
	
	private Long discountRate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRATION_DATE")
	private Date expirationDate;

	public Coupon() {

	}

	public Coupon(Item item, Long discountRate) {
		this.item = item;
		this.discountRate = discountRate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Long getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Long discountRate) {
		this.discountRate = discountRate;
	}

	// hashcode & equals implementation

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", item=" + item + ", discountRate=" + discountRate + "]";
	}
}
