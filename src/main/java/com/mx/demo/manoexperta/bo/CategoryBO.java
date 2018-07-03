package com.mx.demo.manoexperta.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mx.demo.manoexperta.dao.CategoryDAO;
import com.mx.demo.manoexperta.model.Category;
import com.mx.demo.manoexperta.response.Response;

@Component
public class CategoryBO {

	@Autowired
	private CategoryDAO categoryDAO;

	public Response getCategories() {

		Response response = new Response();

		Iterable<Category> iterable = categoryDAO.getAll();

		List<Category> lista = new ArrayList<Category>();

		for (Category category : iterable) {
			lista.add(category);
		}

		response.setData(lista);
		response.setErrorcode("200");
		response.setErrormsg("OK");
		response.setSuccess(true);

		return response;

	}

}
