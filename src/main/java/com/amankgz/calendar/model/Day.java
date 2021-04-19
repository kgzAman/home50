package com.amankgz.calendar.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;


public class Day {
    public Day() {
    }

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
        private int id ;

        private String date;
        private List<Task> tasks;

        public Day(String date, List<Task> tasks) {
            this.date = date;
            this.tasks = tasks;
        }

        public String getDate() { return date; }

        public void setDate(String date) { this.date = date; }

        public List<Task> getTasks() { return tasks; }

        public void setTasks(List<Task> task) { this.tasks = tasks; }


}
