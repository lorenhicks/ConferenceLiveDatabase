package com.lhdevserver.conferencecheckin.service;

import com.lhdevserver.conferencecheckin.model.Attendee;
import com.lhdevserver.conferencecheckin.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeServiceImpl implements AttendeeService {

    @Autowired
    private AttendeeRepository attendeeRepository;
    @Override
    public Attendee saveAttendee(Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    @Override
    public List<Attendee> getAllAttendees() {
        return attendeeRepository.findAll();
    }
}
