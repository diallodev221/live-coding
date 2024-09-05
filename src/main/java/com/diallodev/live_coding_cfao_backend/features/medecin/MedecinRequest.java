package com.diallodev.live_coding_cfao_backend.features.medecin;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.List;

@Builder
public record MedecinRequest(
        @NotNull(message = "Le nom est requis.")
        String nom,
        @NotNull(message = "Le prénom est requis.")
        String prenom,

        List<String> horaires,

        @NotNull(message = "La specialité est requis.")
        Integer specialityId
) {
}
