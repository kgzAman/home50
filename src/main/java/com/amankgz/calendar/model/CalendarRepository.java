package com.amankgz.calendar.model;

import org.springframework.data.repository.CrudRepository;

public interface CalendarRepository extends CrudRepository<Day, String> {
}
