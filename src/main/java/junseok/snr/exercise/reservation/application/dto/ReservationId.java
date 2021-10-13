package junseok.snr.exercise.reservation.application.dto;

import org.springframework.lang.NonNull;

public class ReservationId {

    private final Long id;

    public ReservationId(@NonNull Long id) {
        this.id = id;
    }
}
