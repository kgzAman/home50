package com.amankgz.calendar.controller;

import com.amankgz.calendar.model.CalendarRepository;
import com.amankgz.calendar.service.CalendarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class calendarController {

    private final CalendarRepository repository;
    private final CalendarService service;

    public calendarController(CalendarRepository calendarRepository, CalendarService calendarService) {
        this.service = calendarService;
        this.repository = calendarRepository;
    }
    @GetMapping("/")
    public String root(Model model) {
        model.addAttribute("mainPage", repository.findAll());
        return "mainPage";
    }
//
//    @GetMapping("/")
//    public String handleVotes(Model model) {
//        model.addAttribute("mainPage", service.candidatesWithVotes());
//        return "votes";
//    }
}
