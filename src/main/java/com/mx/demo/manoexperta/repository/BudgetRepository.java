package com.mx.demo.manoexperta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.demo.manoexperta.model.Budget;

@Repository
public interface BudgetRepository extends CrudRepository<Budget, Integer> {

}
