package com.diallodev.live_coding_cfao_backend.features.speciality;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class SpecialieService {

    private final SpecialiteRepository repository;


    public Collection<Speciality> getAll() {
        return repository.findAll();
    }

    public Speciality loadEntity(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Speciality not found"));

    }
}
