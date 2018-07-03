package com.mx.demo.manoexperta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mx.demo.manoexperta.bo.BudgetBO;
import com.mx.demo.manoexperta.response.Response;

@RestController
public class BudgetController {

	@Autowired
	private BudgetBO budgetBO;

	@RequestMapping(value = "/getBudgets.cfc", method = RequestMethod.GET)
	public Response getBudgets() {
		return budgetBO.getBudgets();
	}
}
