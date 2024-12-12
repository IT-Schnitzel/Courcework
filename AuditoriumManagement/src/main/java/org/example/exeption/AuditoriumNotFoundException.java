package org.example.exeption;

public class AuditoriumNotFoundException extends RuntimeException {

    public AuditoriumNotFoundException(String message) {
        super(message);
    }
}

