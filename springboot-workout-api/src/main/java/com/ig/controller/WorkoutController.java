package com.ig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ig.entity.Workout;
import com.ig.model.WorkoutDTO;
import com.ig.service.WorkoutService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

	@Autowired
	WorkoutService workoutService;
	
	@PostMapping
    public ResponseEntity<String> addWorkout(@Valid @RequestBody WorkoutDTO workoutDTO) {
        return ResponseEntity.ok(workoutService.addWorkout(workoutDTO));
    }

    @GetMapping
    public ResponseEntity<List<WorkoutDTO>> getAllWorkouts() {
        return ResponseEntity.ok(workoutService.getAllWorkout());
    }
	
}
