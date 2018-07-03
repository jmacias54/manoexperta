package com.mx.demo.manoexperta.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the _tokens database table.
 * 
 */
@Entity
@Table(name = "_tokens")

public class Token implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String token;

	private Date expiry;

	private Integer userId;

	public Token() {
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpiry() {
		return this.expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public Integer getUserid() {
		return this.userId;
	}

	public void setUserid(Integer userId) {
		this.userId = userId;
	}

}