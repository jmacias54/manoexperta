package com.mx.demo.manoexperta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mx.demo.manoexperta.bo.CategoryBO;
import com.mx.demo.manoexperta.response.Response;

@RestController
public class CategoryController {

	@Autowired
	private CategoryBO categoryBO;

	@RequestMapping(value = "/getCategories.cfc", method = RequestMethod.GET)
	public Response getCategories() {
		return categoryBO.getCategories();
	}

}
