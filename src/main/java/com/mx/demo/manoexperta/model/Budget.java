package com.mx.demo.manoexperta.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "_budgets")
public class Budget implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer budgetid;

	private String budgetspa;

	private String currency;

	public Budget() {
	}

	public Integer getBudgetid() {
		return this.budgetid;
	}

	public void setBudgetid(Integer budgetid) {
		this.budgetid = budgetid;
	}

	public String getBudgetspa() {
		return this.budgetspa;
	}

	public void setBudgetspa(String budgetspa) {
		this.budgetspa = budgetspa;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
