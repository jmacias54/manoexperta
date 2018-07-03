package com.mx.demo.manoexperta.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.demo.manoexperta.model.Token;

@Repository
public interface TokenRepository extends CrudRepository<Token, String> {

	@Query(" DELETE FROM Token t WHERE t.userId = :userId ")
	void deleteByUserId(@Param("userId") Integer userId);

}
