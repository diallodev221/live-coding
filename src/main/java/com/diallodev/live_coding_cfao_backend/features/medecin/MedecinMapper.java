package com.diallodev.live_coding_cfao_backend.features.medecin;

import org.springframework.stereotype.Service;

@Service
public class MedecinMapper {

    MedecinResponse toResponse(Medecin medecin) {
        return MedecinResponse.builder()
                .id(medecin.getId())
                .nom(medecin.getNom())
                .prenom(medecin.getPrenom())
                .horaires(medecin.getHoraires())
                .speciality(medecin.getSpeciality())
                .build();
    }
}
