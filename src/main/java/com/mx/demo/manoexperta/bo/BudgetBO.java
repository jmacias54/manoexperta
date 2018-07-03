package com.mx.demo.manoexperta.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mx.demo.manoexperta.model.Budget;
import com.mx.demo.manoexperta.repository.BudgetRepository;
import com.mx.demo.manoexperta.response.Response;

@Component
public class BudgetBO {

	@Autowired
	private BudgetRepository budgetRepository;

	public Response getBudgets() {

		Response response = new Response();

		Iterable<Budget> iterableBudgets = budgetRepository.findAll();

		List<Budget> listaBudgets = new ArrayList<Budget>();

		for (Budget budget : iterableBudgets) {
			listaBudgets.add(budget);
		}

		response.setData(listaBudgets);
		response.setErrorcode("200");
		response.setErrormsg("OK");
		response.setSuccess(true);

		return response;

	}

}
