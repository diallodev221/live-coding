package com.diallodev.live_coding_cfao_backend.fake;

import com.diallodev.live_coding_cfao_backend.features.speciality.SpecialiteRepository;
import com.diallodev.live_coding_cfao_backend.features.speciality.Speciality;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class InitDB {

    @Bean
    CommandLineRunner run(SpecialiteRepository repository) {
        return args -> {

//            List<Speciality> specialities = Arrays.asList(
//                    Speciality.builder().libelle("Gastro-entérologie").build(),
//                    Speciality.builder().libelle("Gynécologie").build(),
//                    Speciality.builder().libelle("Hématologie").build(),
//                    Speciality.builder().libelle("Infectiologie").build(),
//                    Speciality.builder().libelle("Médecine Aigue").build(),
//                    Speciality.builder().libelle("Médecine du travail").build(),
//                    Speciality.builder().libelle("Médecine générale").build()
//            );
//
//
//            repository.saveAll(specialities);
        };
    }
}
