package com.diallodev.live_coding_cfao_backend.features.speciality;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialiteRepository extends JpaRepository<Speciality, Integer> {
}
