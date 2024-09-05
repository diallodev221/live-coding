package com.diallodev.live_coding_cfao_backend.features.medecin;

import com.diallodev.live_coding_cfao_backend.features.speciality.Speciality;
import lombok.Builder;

import java.util.List;

@Builder
public record MedecinResponse(
        Integer id,
        String nom,
        String prenom,
        List<String> horaires,
        Speciality speciality
) {
}
