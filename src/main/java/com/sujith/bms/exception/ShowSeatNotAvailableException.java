package com.sujith.bms.exception;

import com.sujith.bms.models.ShowSeat;

public class ShowSeatNotAvailableException extends Exception {
    public ShowSeatNotAvailableException(Long showSeatId) {
        super("ShowSeat with id: " + showSeatId + " isn't available");
    }
}
