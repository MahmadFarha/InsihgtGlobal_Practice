package com.ig.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkoutDTO {
	
	@NotBlank(message = "Title is required")
	private String title;
	
	@Min(value = 1, message = "Duration must be at least 1 minute")
	private int duration;
	
	@Min(value = 1, message = "Calories Burnt must be at least 1")
	private int caloriesBurnt;
	
	@NotBlank(message = "Category is required")
	private String category;
}
