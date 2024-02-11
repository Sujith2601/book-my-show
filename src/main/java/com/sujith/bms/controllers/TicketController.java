package com.sujith.bms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sujith.bms.dto.BookTicketRequestDto;
import com.sujith.bms.dto.BookTicketResponseDto;
import com.sujith.bms.dto.CancelTicketRequestDto;
import com.sujith.bms.dto.CancelTicketResponseDto;
import com.sujith.bms.exception.ShowSeatNotAvailableException;
import com.sujith.bms.models.Ticket;
import com.sujith.bms.models.enums.ResponseStatus;
import com.sujith.bms.services.TicketService;

@Controller
public class TicketController {
    private TicketService ticketService;

    @Autowired
    TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

   public BookTicketResponseDto bookTicket(BookTicketRequestDto requestDto) throws ShowSeatNotAvailableException {
       Ticket ticket = ticketService.bookTicket(
               requestDto.getShowSeatIds(),
               requestDto.getUserId()
       );

       BookTicketResponseDto responseDto = new BookTicketResponseDto();
       responseDto.setTicket(ticket);
       responseDto.setResponseStatus(ResponseStatus.SUCCESS);

       return responseDto;
    }

    public CancelTicketResponseDto cancelTicket(CancelTicketRequestDto requestDto) {
        return null;
    }
}

//Spring Framework -> Dependency Injection
