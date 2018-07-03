package com.mx.demo.manoexperta.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.demo.manoexperta.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("SELECT u.userid FROM User u WHERE (u.email = :user and u.password =:pass) OR (mobile = :user and password = :pass)")
	Integer getIdByUserAndPassword(@Param("user") String user, @Param("pass") String pass);

}
