package com.amankgz.calendar.model;

import com.amankgz.calendar.service.CalendarService;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class CalendarModel {

    protected List<Day> days = new ArrayList<>();
    private  CalendarService calendarService;
    public CalendarModel(){

        String dateDay;
        String date = "2021-04-%s";

        for(int i = 1; i<31; i++){
            if(i < 10) {
                dateDay = "0" + i;
            }
            else{
                dateDay = "" + i;
            }
            String dateForTasks = String.format(date, dateDay);

            Day newDay = new Day(dateForTasks,calendarService.makeTasks());
            days.add(newDay);
        }
    }
}
