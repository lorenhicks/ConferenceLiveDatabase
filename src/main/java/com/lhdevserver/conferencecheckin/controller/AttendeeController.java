package com.lhdevserver.conferencecheckin.controller;

import com.lhdevserver.conferencecheckin.service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.lhdevserver.conferencecheckin.model.Attendee;

import java.util.List;


@RestController
@RequestMapping("/attendee")
public class AttendeeController {
    @Autowired
    private AttendeeService attendeeService;

    @PostMapping("/add")
    public String add(@RequestBody Attendee attendee){
        attendeeService.saveAttendee(attendee);
        return "Attendee has checked in to Conference Hall A";
    }

    @GetMapping("/getAll")
    public List<Attendee> getAllAttendees(){
        return attendeeService.getAllAttendees();
    }
}
