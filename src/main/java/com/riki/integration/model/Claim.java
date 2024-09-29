package com.riki.integration.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "claim")
public class Claim implements Serializable {

    @Serial
    private static final long serialVersionUID = -2717624279840430130L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lob", nullable = false)
    private String lob;

    @Column(name = "penyebab_klaim", nullable = false)
    private String penyebabKlaim;

    @Column(name = "periode")
    private LocalDate periode;

    @Column(name = "nilai_beban_klaim")
    private double nilaiBebanKlaim;

}




