package com.ig.service;

import java.util.List;

import com.ig.model.WorkoutDTO;

public interface WorkoutService {
	public String addWorkout(WorkoutDTO workoutDTO);
	public List<WorkoutDTO> getAllWorkout();
}
