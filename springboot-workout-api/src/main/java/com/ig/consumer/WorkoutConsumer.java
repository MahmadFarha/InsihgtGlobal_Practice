package com.ig.consumer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ig.entity.Workout;

import java.util.Arrays;
import java.util.List;

@Service
public class WorkoutConsumer {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String BASE_URL = "http://localhost:8080/api/workouts";

    public List<Workout> getAllWorkouts() {
        Workout[] workouts = restTemplate.getForObject(BASE_URL, Workout[].class);
        return Arrays.asList(workouts);
    }
}
