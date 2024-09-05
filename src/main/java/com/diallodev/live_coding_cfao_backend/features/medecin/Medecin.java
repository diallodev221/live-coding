package com.diallodev.live_coding_cfao_backend.features.medecin;

import com.diallodev.live_coding_cfao_backend.features.speciality.Speciality;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "medeicin")
public class Medecin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String prenom;

    private List<String> horaires = new ArrayList<>();

    @OneToOne
    private Speciality speciality;

}
