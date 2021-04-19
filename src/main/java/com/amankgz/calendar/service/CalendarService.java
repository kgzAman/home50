package com.amankgz.calendar.service;


import com.amankgz.calendar.model.Day;
import com.amankgz.calendar.model.CalendarRepository;


import com.amankgz.calendar.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CalendarService {
    private final CalendarRepository repository;
    private final List<String> categories = Arrays.asList("red", "black", "yellow", "blue");

    public CalendarService(CalendarRepository repository) {
        this.repository = repository;
    }

    public Optional<Day> getById(String dayID) {
        return repository.findById(dayID);
    }

    public List<Task> makeTasks(){
        List<Task> tasksForDay = new ArrayList<>();

        Random ran = new Random();
        int numberOfTasks = ran.nextInt(6) + 1;
        for(int i = 0; i < numberOfTasks; i++) {
            int index_category = ran.nextInt(categories.size());

            Task task = new Task(Generator.makeName(), Generator.makeDescription(),categories.get(index_category));

            tasksForDay.add(task);
        }
        return tasksForDay;
    }


}
