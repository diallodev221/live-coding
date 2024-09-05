package com.diallodev.live_coding_cfao_backend.features.medecin;

import java.util.Collection;

public interface IMedecinService {

    MedecinResponse create(MedecinRequest request);

    Collection<MedecinResponse> getAll();

    Collection<MedecinResponse> getMedecinsBySpecialite(String specialite);

    void update(Integer medecinId, MedecinRequest request);

    void delete(Integer medecinId);
}
