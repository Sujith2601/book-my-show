package com.sujith.bms.models;

import lombok.Getter;
import lombok.Setter;

import com.sujith.bms.models.enums.ShowSeatState;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
//@Table(name = "show_seat_mapping")
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatState state;
}