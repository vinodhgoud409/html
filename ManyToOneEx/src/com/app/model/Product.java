package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prodtab")
public class Product {
	@Id
	@Column(name="pid")
	private int prodId;
	@Column(name="pcode")
	private String prodCode;
	@Column(name="pcost")
	private double prodCost;

	@ManyToOne
	@JoinColumn(name="bidfk")
	private Brand bob;

	public Product() {
		super();
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public double getProdCost() {
		return prodCost;
	}

	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}

	public Brand getBob() {
		return bob;
	}

	public void setBob(Brand bob) {
		this.bob = bob;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + ", bob=" + bob + "]";
	}


}



