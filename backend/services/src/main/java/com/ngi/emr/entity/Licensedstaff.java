package com.ngi.emr.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "licensedstaff")
public class Licensedstaff implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "staffId")
    private Integer staffId;

    @Column(name = "licenseId")
    private String licenseId;

    @Column(name = "licenseState")
    private String licenseState;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "inclusions")
    private String inclusions;

    @Column(name = "exclusions")
    private String exclusions;

    @Column(name = "canPrescribe")
    private Boolean canPrescribe;

    @Column(name = "canDiagnose")
    private Boolean canDiagnose;

}
