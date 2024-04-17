package com.ngi.emr.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "patientallergies")
public class Patientallergies implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "patientId")
    private Integer patientId;

    @Column(name = "allergyId")
    private Integer allergyId;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "verified")
    private Boolean verified;

    @Column(name = "verifiedby")
    private Integer verifiedby;

    @Column(name = "verifiedDate")
    private Date verifiedDate;

}
