package com.sujith.bms.dto;

import com.sujith.bms.models.ResponseStatus;
import com.sujith.bms.models.Ticket;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter // Lombok
public class BookTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;
}
