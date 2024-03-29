package com.sujith.bms.models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

import com.sujith.bms.models.enums.TicketStatus;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private User bookedBy;

    @ManyToOne
    private Show show;

    @ManyToMany
    private List<ShowSeat> showSeats;
    private double totalAmount;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;

    private Date timeOfBooking;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;
}

//payment - ticket M:1 -> ticket_id in the payments table.
// ticket - payment -> 1:M -> ticket_id in the payments table.
