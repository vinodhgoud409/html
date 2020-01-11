package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brndtab")
public class Brand {
	@Id
	@Column(name="bid")
	private int brnId;
	@Column(name="bcode")
	private String brnCode;
	@Column(name="binfo")
	private String  brnInfo;
	public Brand() {
		super();
	}
	public int getBrnId() {
		return brnId;
	}
	public void setBrnId(int brnId) {
		this.brnId = brnId;
	}
	public String getBrnCode() {
		return brnCode;
	}
	public void setBrnCode(String brnCode) {
		this.brnCode = brnCode;
	}
	public String getBrnInfo() {
		return brnInfo;
	}
	public void setBrnInfo(String brnInfo) {
		this.brnInfo = brnInfo;
	}
	@Override
	public String toString() {
		return "Brand [brnId=" + brnId + ", brnCode=" + brnCode + ", brnInfo=" + brnInfo + "]";
	}



}
