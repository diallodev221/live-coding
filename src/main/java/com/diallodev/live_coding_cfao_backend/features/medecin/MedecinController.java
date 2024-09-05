package com.diallodev.live_coding_cfao_backend.features.medecin;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/medecins")
@RequiredArgsConstructor
@CrossOrigin
public class MedecinController {


    private final IMedecinService service;

    @GetMapping
    public ResponseEntity<Collection<MedecinResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/filter")
    public ResponseEntity<Collection<MedecinResponse>> getMedecinsBySpecialite(@RequestParam("specialite") String specialite) {
        return ResponseEntity.ok(service.getMedecinsBySpecialite(specialite));

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MedecinResponse create(@RequestBody MedecinRequest request) {
        return service.create(request);
    }

    @PutMapping("/{medecin-id}")
    public void update(@PathVariable("medecin-id") Integer id, @RequestBody MedecinRequest request) {
        service.update(id, request);
    }

    @DeleteMapping("/{medecin-id}")
    public void delete(@PathVariable("medecin-id") Integer id) {
        service.delete(id);
    }



}
