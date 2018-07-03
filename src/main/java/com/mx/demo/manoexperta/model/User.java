package com.mx.demo.manoexperta.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the _users database table.
 * 
 */
@Entity
@Table(name = "_users")

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer userid;

	private String address;

	private String email;

	private String firstname;

	private Integer hasavatar;

	private String lang;

	private String lastname;

	private String lastview;

	private Integer maxcats;

	private String mobile;

	private String password;

	private Integer placeId;

	private Integer rangeKM;

	private Date regdate;

	public User() {
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getHasavatar() {
		return hasavatar;
	}

	public void setHasavatar(Integer hasavatar) {
		this.hasavatar = hasavatar;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastview() {
		return lastview;
	}

	public void setLastview(String lastview) {
		this.lastview = lastview;
	}

	public Integer getMaxcats() {
		return maxcats;
	}

	public void setMaxcats(Integer maxcats) {
		this.maxcats = maxcats;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public Integer getRangeKM() {
		return rangeKM;
	}

	public void setRangeKM(Integer rangeKM) {
		this.rangeKM = rangeKM;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}