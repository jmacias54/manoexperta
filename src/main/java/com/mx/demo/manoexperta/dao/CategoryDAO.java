package com.mx.demo.manoexperta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.demo.manoexperta.model.Category;

@Repository
public class CategoryDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Category> getAll() {
		List<Category> lista = null;

		lista = jdbcTemplate.query(" select * from _categories ", new BeanPropertyRowMapper<Category>(Category.class));

		return lista;
	}
}
