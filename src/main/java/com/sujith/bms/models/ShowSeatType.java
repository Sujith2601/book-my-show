package com.sujith.bms.models;

import lombok.Getter;
import lombok.Setter;

import com.sujith.bms.models.enums.SeatType;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
//@Table(name = "show_seattype_mapping")
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show show;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private double price;
}
