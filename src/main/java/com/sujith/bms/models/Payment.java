package com.sujith.bms.models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

import com.sujith.bms.models.enums.PaymentMethod;
import com.sujith.bms.models.enums.PaymentStatus;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod paymentMethod;

    private Date timeOfPayment;
    private double amount;
    private String referenceId;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @ManyToOne
    private Ticket ticket;
}

// 1      - 1
//Payment - Ticket -> M:1
//  M        1