package com.crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findAll();

	Optional<User> findById(int id);

}
