package com.sujith.bms.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.sujith.bms.models.ShowSeat;

@Getter
@Setter
public class BookTicketRequestDto {
    private List<Long> showSeatIds;
    private Long userId;
}
