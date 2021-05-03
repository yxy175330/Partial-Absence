package com.PA.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PA.model.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Integer> {
	Optional<Trainee> findByEmail(String email);
}
