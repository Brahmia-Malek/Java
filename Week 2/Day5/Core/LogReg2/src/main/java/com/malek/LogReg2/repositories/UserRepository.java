package com.malek.LogReg2.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malek.LogReg2.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	// FIND USER BY EMAIL
    Optional<User> findByEmail(String email);

}
