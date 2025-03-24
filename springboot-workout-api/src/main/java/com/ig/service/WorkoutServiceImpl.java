package com.ig.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ig.entity.Workout;
import com.ig.model.WorkoutDTO;
import com.ig.repository.WorkoutRepository;

import springfox.documentation.swagger2.mappers.ModelMapper;

@Service
public class WorkoutServiceImpl implements WorkoutService {
	
	@Autowired
	WorkoutRepository workoutRepository;
	
//	@Autowired
//	ModelMapper modelMapper;

	@Override
	public String addWorkout(WorkoutDTO workoutDTO) {
		Workout workout = new Workout();
        workout.setTitle(workoutDTO.getTitle());
        workout.setDuration(workoutDTO.getDuration());
        workout.setCaloriesBurnt(workoutDTO.getCaloriesBurnt());
        workout.setCategory(workoutDTO.getCategory());
        workoutRepository.save(workout);
		
		return "Workout Added";
	}

	@Override
	public List<WorkoutDTO> getAllWorkout() {
//		List<WorkoutDTO> workoutList = new ArrayList<>();
//		for( Workout workout : workoutRepository.findAll()) {
//			WorkoutDTO obj = new WorkoutDTO();
//			obj.setTitle(workout.getTitle());
//			obj.setDuration(workout.getDuration());
//			obj.setCaloriesBurnt(workout.getCaloriesBurnt());
//			obj.setCategory(workout.getCategory());
//			workoutList.add(obj);
//		}
//		return workoutList;
		
		return workoutRepository.findAll().stream()
		        .map(workout -> new WorkoutDTO(
		                workout.getTitle(),
		                workout.getDuration(),
		                workout.getCaloriesBurnt(),
		                workout.getCategory()
		        ))
		        .collect(Collectors.toList());
	}

}
