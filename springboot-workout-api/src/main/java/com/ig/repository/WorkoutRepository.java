package com.ig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ig.entity.Workout;


@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> { 
	
}
