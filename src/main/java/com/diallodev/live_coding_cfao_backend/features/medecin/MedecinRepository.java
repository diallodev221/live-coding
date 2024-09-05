package com.diallodev.live_coding_cfao_backend.features.medecin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Integer> {

    Collection<Medecin> findAllBySpecialityLibelle(String specialite);
}
