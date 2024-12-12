package org.example.controller;


import org.example.model.Auditorium;
import org.example.service.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auditoriums")
public class AuditoriumController {

    private final AuditoriumService auditoriumService;

    @Autowired
    public AuditoriumController(AuditoriumService auditoriumService) {
        this.auditoriumService = auditoriumService;
    }

    @GetMapping
    public List<Auditorium> getAllAuditoriums() {
        return auditoriumService.getAllAuditoriums();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Auditorium> getAuditoriumById(@PathVariable Long id) {
        Optional<Auditorium> auditorium = auditoriumService.getAuditoriumById(id);
        return auditorium.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Auditorium> createAuditorium(@RequestBody Auditorium auditorium) {
        Auditorium createdAuditorium = auditoriumService.createAuditorium(auditorium);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAuditorium);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuditorium(@PathVariable Long id) {
        auditoriumService.deleteAuditorium(id);
        return ResponseEntity.noContent().build();
    }
}

