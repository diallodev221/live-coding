package com.diallodev.live_coding_cfao_backend.features.speciality;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/specialites")
@RequiredArgsConstructor
@CrossOrigin
public class SpecialityController {

    private final SpecialieService specialieService;


    @GetMapping
    public ResponseEntity<Collection<Speciality>> getAll() {
        return ResponseEntity.ok(specialieService.getAll());
    }
}
