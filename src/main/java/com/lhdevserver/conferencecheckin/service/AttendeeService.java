package com.lhdevserver.conferencecheckin.service;

import com.lhdevserver.conferencecheckin.model.Attendee;

import java.util.List;

public interface AttendeeService {
    public Attendee saveAttendee(Attendee attendee);
    public List<Attendee> getAllAttendees();
}
