package com.theironyard.services;

import com.theironyard.Entities.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben on 6/23/16.
 */
public interface EventRepository extends CrudRepository<Event, Integer> {
}
