package com.lhdevserver.conferencecheckin.repository;

import com.lhdevserver.conferencecheckin.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee,Integer> {
}
