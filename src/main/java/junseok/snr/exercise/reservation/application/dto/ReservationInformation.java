package junseok.snr.exercise.reservation.application.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ReservationInformation {

    private ReservationInformationId reservationInformationId;
    private Place place;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Options options;
}
