package com.diallodev.live_coding_cfao_backend.features.medecin;

import com.diallodev.live_coding_cfao_backend.features.speciality.SpecialieService;
import com.diallodev.live_coding_cfao_backend.features.speciality.Speciality;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class MedecinService implements IMedecinService {

    private final MedecinRepository repository;
    private final MedecinMapper mapper;

    private final SpecialieService specialieService;

    @Override
    public MedecinResponse create(MedecinRequest request) {

        // find specialite
        var speciality = specialieService.loadEntity(request.specialityId());

        Medecin medecin = Medecin.builder()
                .nom(request.nom())
                .prenom(request.prenom())
                .horaires(request.horaires())
                .speciality(speciality)
                .build();

        return mapper.toResponse(repository.save(medecin));
    }

    @Override
    public Collection<MedecinResponse> getAll() {
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public Collection<MedecinResponse> getMedecinsBySpecialite(String specialite) {
        return repository.findAllBySpecialityLibelle(specialite).stream()
                .map(mapper::toResponse)
                .toList();

    }

    @Override
    public void update(Integer medecinId, MedecinRequest request) {

        Medecin existingMedecin = repository.findById(medecinId)
                .orElseThrow(() -> new IllegalArgumentException("Medecin not found"));

        Speciality speciality = specialieService.loadEntity(request.specialityId());


        if (existingMedecin != null) {
            Medecin updatedMedecin = Medecin.builder()
                    .id(existingMedecin.getId())
                    .nom(request.nom())
                    .prenom(request.prenom())
                    .horaires(request.horaires())
                    .speciality(speciality)
                    .build();

            repository.save(updatedMedecin);
        }

    }

    @Override
    public void delete(Integer medecinId) {
        repository.deleteById(medecinId);
    }
}
