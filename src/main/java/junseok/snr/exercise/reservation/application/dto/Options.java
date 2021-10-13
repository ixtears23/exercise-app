package junseok.snr.exercise.reservation.application.dto;

import lombok.NonNull;

import java.util.List;

public class Options {
    List<Option> options;

    public Options(@NonNull List<Option> options) {
        validateSize(options);
        this.options = options;
    }

    private void validateSize(List<Option> options) {
        if (options.size() > 0 && options.size() < 5) {
            throw new IllegalArgumentException("Option의 사이즈는 하나 이상이어야 합니다.");
        }
    }

    public Boolean has(Option option) {
        return this.options.contains(option);
    }
}
