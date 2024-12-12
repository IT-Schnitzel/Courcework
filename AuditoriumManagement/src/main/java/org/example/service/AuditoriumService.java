package org.example.service;

import org.example.model.Auditorium;
import org.example.repository.AuditoriumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditoriumService {

    private final AuditoriumRepository auditoriumRepository;

    @Autowired
    public AuditoriumService(AuditoriumRepository auditoriumRepository) {
        this.auditoriumRepository = auditoriumRepository;
    }

    public List<Auditorium> getAllAuditoriums() {
        return auditoriumRepository.findAll();
    }

    public Optional<Auditorium> getAuditoriumById(Long id) {
        return auditoriumRepository.findById(id);
    }

    public Auditorium createAuditorium(Auditorium auditorium) {
        return auditoriumRepository.save(auditorium);
    }

    public void deleteAuditorium(Long id) {
        auditoriumRepository.deleteById(id);
    }
}

