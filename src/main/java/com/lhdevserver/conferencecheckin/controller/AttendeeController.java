package com.lhdevserver.conferencecheckin.controller;

import com.lhdevserver.conferencecheckin.service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lhdevserver.conferencecheckin.model.Attendee;


@RestController
@RequestMapping("/student")
public class AttendeeController {
    @Autowired
    private AttendeeService attendeeService;

    @PostMapping("/add")
    public String add(@RequestBody Attendee attendee){
        attendeeService.saveAttendee(attendee);
        return "Attendee has checked in to Conference Hall A";
    }
}
