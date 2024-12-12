package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditoriumResponse {

    private Long id;
    private String name;
    private Integer capacity;
    private String location;
}

