package org.movies.domain.enumeration;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorEnum {
    DEFAULT_VALIDATION_ERROR("000", "Default Validation Error");

    private final String code;
    private final String message;
}
