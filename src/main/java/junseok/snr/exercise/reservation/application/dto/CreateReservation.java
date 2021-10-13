package junseok.snr.exercise.reservation.application.dto;

import java.time.LocalDateTime;

public class CreateReservation {

    public static class Request {
        private ReservationId reservationId;
        private String booker;
        private LocalDateTime reservationTime;
        private ReservationInformation reservationInformation;
    }

    public static class Response {

    }
}
