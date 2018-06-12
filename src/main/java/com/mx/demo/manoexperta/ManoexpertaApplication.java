package com.mx.demo.manoexperta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mx.demo.manoexperta.dao.CategoryDAO;
import com.mx.demo.manoexperta.model.Category;

@SpringBootApplication
@RestController
public class ManoexpertaApplication {

	@Autowired
	private CategoryDAO categoryDAO;

	public static void main(String[] args) {
		SpringApplication.run(ManoexpertaApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Category> getAll() {
		return categoryDAO.getAll();
	}
}
