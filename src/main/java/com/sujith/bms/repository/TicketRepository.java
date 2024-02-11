package com.sujith.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujith.bms.controllers.TicketController;
import com.sujith.bms.models.Ticket;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    Ticket save(Ticket ticket); //UPSERT

    Ticket save(List<Ticket> tickets);
}

//insert into tickets values (a,b,c), (x,y, z), (p,q,r) and so on.
